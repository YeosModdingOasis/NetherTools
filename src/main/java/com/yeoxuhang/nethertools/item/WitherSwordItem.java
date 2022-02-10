package com.yeoxuhang.nethertools.item;

import com.yeoxuhang.nethertools.event.WitherSwordEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class WitherSwordItem extends SwordItem {
    public WitherSwordItem() {
        super(new Tier() {
                  public int getUses() {
                      return 1000;
                  }

                  public float getSpeed() {
                      return 4f;
                  }

                  public float getAttackDamageBonus() {
                      return 2f;
                  }

                  public int getLevel() {
                      return 4;
                  }

                  public int getEnchantmentValue() {
                      return 2;
                  }

                  public Ingredient getRepairIngredient() {
                      return Ingredient.EMPTY;
                  }
              },

                3, -3f,

                new Properties().tab(CreativeModeTab.TAB_COMBAT).rarity(Rarity.EPIC).fireResistant());

        setRegistryName("wither_sword");
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        Level world = entity.level;

        WitherSwordEvent.execute(entity, sourceentity);
        return retval;
    }

}