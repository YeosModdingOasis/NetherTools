package com.yeoxuhang.nethertools.init;

//import com.yeoxuhang.nethertools.item.*;
import com.yeoxuhang.nethertools.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NetherToolsModItems {
    private static final List<Item> REGISTRY = new ArrayList<>();
    //Blocks
    //public static final Item BRIMSTONE = register(NetherAndEndExpansionModBlocks.BRIMSTONE, NetherAndEndExpansionModTabs.nethertools_Tab);
    //public static final Item SCORCHEDMUD = register(NetherAndEndExpansionModBlocks.SCORCHEDMUD, NetherAndEndExpansionModTabs.nethertools_Tab);
    //public static final Item SCORCHEDMUDBRICKS = register(NetherAndEndExpansionModBlocks.SCORCHEDMUDBRICKS, NetherAndEndExpansionModTabs.nethertools_Tab);
    //public static final Item NETHERITEBRICKS = register(NetherAndEndExpansionModBlocks.NETHERITEBRICKS, NetherAndEndExpansionModTabs.nethertools_Tab);
    //public static final Item NETHERITETILES = register(NetherAndEndExpansionModBlocks.NETHERITETILES, NetherAndEndExpansionModTabs.nethertools_Tab);
    //Tools
    public static final Item GLOWSTONESHOVEL = register(new GlowstoneShovelItem());
    public static final Item GLOWSTONEPICKAXE = register(new GlowstonePickaxeItem());
    public static final Item GLOWSTONEAXE = register(new GlowstoneAxeItem());
    public static final Item GLOWSTONEHOE = register(new GlowstoneHoeItem());
    //Weapons
    public static final Item GLOWSTONESWORD = register(new GlowstoneSwordItem());
    public static final Item WITHERSWORD = register(new WitherSwordItem());
    //Items
    public static final Item WITHERBONE = register(new WitherBoneItem());
    //Piglin Brute Axe
    public static final Item PIGLINBRUTEGOLDENAXE = register(new PiglinBruteGoldenAxeItem());


    private static Item register(Item item) {
        REGISTRY.add(item);
        return item;
    }

    private static Item register(Block block, CreativeModeTab tab) {
        return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
    }
}
