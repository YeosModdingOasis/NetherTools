package com.yeoxuhang.nethertools.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class WitherBoneItem extends Item {

    public WitherBoneItem() {
        super(new Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).fireResistant());
        setRegistryName("wither_bone");
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 0;
    }

}
