package com.yeoxuhang.nethertools.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class GlowstonePickaxeItem extends PickaxeItem {
    public GlowstonePickaxeItem() {
        super(new Tier() {
            public int getUses() {
                return 100;
            }

            public float getSpeed() {
                return 4.5f;
            }

            public float getAttackDamageBonus() {
                return 3f;
            }

            public int getLevel() {
                return 0;
            }

            public int getEnchantmentValue() {
                return 2;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of( new ItemStack(Items.GLOWSTONE_DUST));
            }
        }, 1, -3f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
        setRegistryName("glowstone_pickaxe");
    }
}
