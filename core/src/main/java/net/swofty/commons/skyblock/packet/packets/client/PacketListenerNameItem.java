package net.swofty.commons.skyblock.packet.packets.client;

import net.minestom.server.event.player.PlayerPacketEvent;
import net.minestom.server.network.packet.client.ClientPacket;
import net.minestom.server.network.packet.client.play.ClientNameItemPacket;
import net.minestom.server.network.packet.server.play.WindowPropertyPacket;
import net.swofty.commons.skyblock.gui.SkyBlockAnvilGUI;
import net.swofty.commons.skyblock.packet.SkyBlockPacketClientListener;
import net.swofty.commons.skyblock.user.SkyBlockPlayer;

import java.util.Map;

public class PacketListenerNameItem extends SkyBlockPacketClientListener {
    @Override
    public Class<? extends ClientPacket> getPacket() {
        return ClientNameItemPacket.class;
    }

    @Override
    public void run(PlayerPacketEvent event, ClientPacket packet, SkyBlockPlayer player) {
        if (SkyBlockAnvilGUI.anvilGUIs.containsKey(player)) {
            SkyBlockAnvilGUI.anvilGUIs.put(player, Map.entry(((ClientNameItemPacket) packet).itemName(), SkyBlockAnvilGUI.anvilGUIs.get(player).getValue()));

            player.sendPacket(new WindowPropertyPacket(player.getOpenInventory().getWindowId(), (short) 0, (short) 0));
        }
    }
}
