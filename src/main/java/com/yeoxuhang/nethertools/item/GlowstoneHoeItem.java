package com.yeoxuhang.nethertools.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class GlowstoneHoeItem extends HoeItem {
    public GlowstoneHoeItem() {
        super(new Tier() {
                  public int getUses() {
                      return 100;
                  }

                  public float getSpeed() {
                      return 34.5f;
                  }

                  public float getAttackDamageBonus() {
                      return 3f;
                  }

                  public int getLevel() {
                      return 4;
                  }

                  public int getEnchantmentValue() {
                      return 14;
                  }

                  public Ingredient getRepairIngredient() {
                      return Ingredient.of(new ItemStack(Items.GLOWSTONE_DUST));
                  }
              },

                0, -3f,

                new Properties().tab(CreativeModeTab.TAB_TOOLS));

        setRegistryName("glowstone_hoe");
    }

}
