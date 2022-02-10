package com.yeoxuhang.nethertools.item;

import com.yeoxuhang.nethertools.event.GlowstoneSwordEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class GlowstoneSwordItem extends SwordItem {
    public GlowstoneSwordItem() {
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
                      return 4;
                  }

                  public int getEnchantmentValue() {
                      return 14;
                  }

                  public Ingredient getRepairIngredient() {
                      return Ingredient.of(new ItemStack(Items.GLOWSTONE_DUST));
                  }
              },

                3, -3f,

                new Properties().tab(CreativeModeTab.TAB_COMBAT));

        setRegistryName("glowstone_sword");
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        Level world = entity.level;

        GlowstoneSwordEvent.execute(entity, sourceentity);
        return retval;
    }

}
