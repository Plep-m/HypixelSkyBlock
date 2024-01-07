package net.swofty.commons.skyblock.item.updater;

import lombok.Getter;
import net.minestom.server.color.Color;
import net.minestom.server.item.Enchantment;
import net.minestom.server.item.ItemHideFlag;
import net.minestom.server.item.ItemStack;
import net.minestom.server.item.Material;
import net.minestom.server.item.metadata.LeatherArmorMeta;
import net.minestom.server.timer.Scheduler;
import net.minestom.server.timer.TaskSchedule;
import net.swofty.commons.skyblock.SkyBlock;
import net.swofty.commons.skyblock.item.ItemLore;
import net.swofty.commons.skyblock.item.ItemType;
import net.swofty.commons.skyblock.item.Rarity;
import net.swofty.commons.skyblock.item.SkyBlockItem;
import net.swofty.commons.skyblock.item.attribute.AttributeHandler;
import net.swofty.commons.skyblock.user.SkyBlockPlayer;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

public class PlayerItemUpdater {

    private static final QueuedUpdateManager updateManager = new QueuedUpdateManager();

    private final BiFunction<SkyBlockPlayer, SkyBlockItem, SkyBlockItem> queuedUpdate;

    public PlayerItemUpdater(BiFunction<SkyBlockPlayer, SkyBlockItem, SkyBlockItem> queuedUpdate) {
        this.queuedUpdate = queuedUpdate;
    }

    public CompletableFuture<SkyBlockItem> queueUpdate(SkyBlockPlayer player, PlayerItemOrigin origin) {
        CompletableFuture<SkyBlockItem> future = new CompletableFuture<>();
        updateManager.queueUpdate(player, origin, queuedUpdate, future);
        return future;
    }

    public static ItemStack.Builder playerUpdate(SkyBlockPlayer player, PlayerItemOrigin origin, ItemStack stack) {
        if (!SkyBlockItem.isSkyBlockItem(stack) || stack.getMaterial().equals(Material.AIR)) {
            /**
             * Item is not SkyBlock item, so we just instance it here
             */
            SkyBlockItem item = new SkyBlockItem(stack.material());
            ItemStack.Builder itemAsBuilder = item.getItemStackBuilder();

            ItemLore lore = new ItemLore(stack);
            lore.updateLore(player);
            stack = lore.getStack();

            return itemAsBuilder.lore(stack.getLore()).amount(stack.amount());
        }

        /**
         * Check for value updates
         */
        SkyBlockItem item = new SkyBlockItem(stack);
        ArrayList<QueuedUpdateManager.UpdatePair> updates = updateManager.getQueuedUpdates(player, origin);
        if (updates != null) {
            for (QueuedUpdateManager.UpdatePair updatePair : updates) {
                item = updatePair.getUpdateFunction().apply(player, item);
                updatePair.getFuture().complete(item);
            }
        }
        updateManager.clearQueue(player, origin);
        ItemStack.Builder toReturn = item.getItemStackBuilder().amount(stack.getAmount());

        /**
         * Update SkyBlock Item Instance
         */
        AttributeHandler handler = item.getAttributeHandler();

        // Update Rarity
        try {
            handler.setRarity(ItemType.valueOf(handler.getItemType()).rarity);
        } catch (IllegalArgumentException e) {
            handler.setRarity(Rarity.COMMON);
        }
        if (handler.isRecombobulated()) {
            handler.setRarity(handler.getRarity().upgrade());
        }

        /**
         * Update Lore
         */
        ItemLore lore = new ItemLore(stack);
        lore.updateLore(player);
        stack = lore.getStack();

        if (handler.shouldBeEnchanted()) {
            toReturn.meta(meta -> {
                meta.enchantment(Enchantment.EFFICIENCY, (short) 1);
                meta.hideFlag(ItemHideFlag.HIDE_DYE,
                        ItemHideFlag.HIDE_ATTRIBUTES,
                        ItemHideFlag.HIDE_ENCHANTS);
            });
        }

        Color leatherColour = handler.getLeatherColour();
        if (leatherColour != null) {
            toReturn.meta(meta -> {
                LeatherArmorMeta.Builder leatherMeta = new LeatherArmorMeta.Builder(meta.tagHandler());
                leatherMeta.color(leatherColour);
                meta.hideFlag(ItemHideFlag.HIDE_DYE,
                        ItemHideFlag.HIDE_ATTRIBUTES,
                        ItemHideFlag.HIDE_ENCHANTS);
            });
        }

        return toReturn.amount(stack.amount()).lore(stack.getLore()).displayName(stack.getDisplayName());
    }

    public static void updateLoop(Scheduler scheduler) {
        scheduler.submitTask(() -> {
            SkyBlock.getLoadedPlayers().forEach(player -> {
                Arrays.stream(PlayerItemOrigin.values()).forEach(origin -> {
                    if (!origin.shouldBeLooped()) return;

                    ItemStack item = origin.getStack(player);
                    if (item == null) return;
                    if (item.isAir()) return;

                    origin.setStack(player, playerUpdate(player, origin, item).build());
                });
            });
            return TaskSchedule.tick(1);
        });
    }

    public static class QueuedUpdateManager {

        @Getter
        private static final class UpdatePair {
            private final BiFunction<SkyBlockPlayer, SkyBlockItem, SkyBlockItem> updateFunction;
            private final CompletableFuture<SkyBlockItem> future;

            public UpdatePair(BiFunction<SkyBlockPlayer, SkyBlockItem, SkyBlockItem> updateFunction, CompletableFuture<SkyBlockItem> future) {
                this.updateFunction = updateFunction;
                this.future = future;
            }

        }

        private final Map<Map.Entry<SkyBlockPlayer, PlayerItemOrigin>,
                ArrayList<UpdatePair>> queuedUpdates = new HashMap<>();

        public synchronized void queueUpdate(SkyBlockPlayer player, PlayerItemOrigin origin,
                                             BiFunction<SkyBlockPlayer, SkyBlockItem, SkyBlockItem> updateFunction,
                                             CompletableFuture<SkyBlockItem> future) {
            Map.Entry<SkyBlockPlayer, PlayerItemOrigin> key = new AbstractMap.SimpleEntry<>(player, origin);
            queuedUpdates.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(new UpdatePair(updateFunction, future));
        }

        public synchronized ArrayList<UpdatePair> getQueuedUpdates(SkyBlockPlayer player, PlayerItemOrigin origin) {
            return queuedUpdates.get(new AbstractMap.SimpleEntry<>(player, origin));
        }

        public synchronized void clearQueue(SkyBlockPlayer player, PlayerItemOrigin origin) {
            queuedUpdates.remove(new AbstractMap.SimpleEntry<>(player, origin));
        }
    }
}