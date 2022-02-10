package com.yeoxuhang.nethertools.item;

import com.yeoxuhang.nethertools.nethertools;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NetherToolsItems {
    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, nethertools.mod_id);

    public static final RegistryObject<Item> NETHERITEHORSEARMOR = ITEMS.register("netherite_horse_armor",
            () -> new HorseArmorItem(100, "netherite",
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant()));

    public static final RegistryObject<Item> GLOWSTONEHORSEARMOR = ITEMS.register("glowstone_horse_armor",
            () -> new HorseArmorItem(10, "glowstone",
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
