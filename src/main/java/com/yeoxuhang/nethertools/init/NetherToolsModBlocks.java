package com.yeoxuhang.nethertools.init;

//import com.yeoxuhang.nethertools.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NetherToolsModBlocks {
    private static final List<Block> REGISTRY = new ArrayList<>();
    //public static final Block BRIMSTONE = register(new BrimstoneBlock());
    //public static final Block SCORCHEDMUD = register(new ScorchedMudBlock());
    //public static final Block SCORCHEDMUDBRICKS = register(new ScorchedMudBricksBlock());
    //public static final Block NETHERITEBRICKS = register(new NetheriteBricksBlock());
    //public static final Block NETHERITETILES = register(new NetheriteTilesBlock());

    private static Block register(Block block) {
        REGISTRY.add(block);
        return block;
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
    }
}
