package io.github.ultrusbot.hexxitgear.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HexicalCore extends Item {
    public HexicalCore(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
