package net.swofty.commons.skyblock.item.items.enchanted;


import net.swofty.commons.skyblock.item.ItemType;
import net.swofty.commons.skyblock.item.impl.Enchanted;
import net.swofty.commons.skyblock.item.impl.SkyBlockRecipe;

public class EnchantedCharcoal implements Enchanted {
    @Override
    public ItemType getCraftingMaterial() {
        return ItemType.CHARCOAL;
    }

    @Override
    public SkyBlockRecipe.RecipeType getRecipeType() {
        return SkyBlockRecipe.RecipeType.FORAGING;
    }
}