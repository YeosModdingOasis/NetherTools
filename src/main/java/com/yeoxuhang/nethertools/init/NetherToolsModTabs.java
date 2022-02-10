package com.yeoxuhang.nethertools.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class NetherToolsModTabs {
    public static CreativeModeTab TAB_NETHER_TOOLS;

    public static void load() {
        TAB_NETHER_TOOLS = new CreativeModeTab("tabnether_tools") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Items.STONE_SHOVEL);
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
