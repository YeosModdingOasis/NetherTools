package com.yeoxuhang.nethertools.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class PiglinBruteGoldenAxeItem extends AxeItem {
    public PiglinBruteGoldenAxeItem() {
        super(new Tier() {
            public int getUses() {
                return 100;
            }

            public float getSpeed() {
                return 4.5f;
            }

            public float getAttackDamageBonus() {
                return 10f;
            }

            public int getLevel() {
                return 0;
            }

            public int getEnchantmentValue() {
                return 20;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of( new ItemStack(Items.GOLD_INGOT));
            }
        }, 1, -3f, new Properties().tab(CreativeModeTab.TAB_TOOLS).rarity(Rarity.UNCOMMON));
        setRegistryName("piglin_brute_golden_axe");
    }
}
