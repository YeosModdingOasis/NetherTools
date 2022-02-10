package com.yeoxuhang.nethertools.init;

import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NetherToolsModPaintings {
    @SubscribeEvent
    public static void registerMotives(RegistryEvent.Register<Motive> event) {
        event.getRegistry().register(new Motive(64, 32).setRegistryName("hoglin_in_crimson_forest"));
        event.getRegistry().register(new Motive(48, 64).setRegistryName("baby_ghast_in_nether_wastes"));
        event.getRegistry().register(new Motive(64, 64).setRegistryName("nether_biomes"));
    }
}

