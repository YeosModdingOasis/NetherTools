package com.yeoxuhang.nethertools.event;

import com.yeoxuhang.nethertools.init.NetherToolsModItems;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WitherSkeletonSpawnEvent {
    @SubscribeEvent
    public static void onEntitySpawned(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        execute(event, entity);
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof WitherSkeleton) {
            if (entity instanceof LivingEntity _entity) {
                ItemStack _setstack = new ItemStack(NetherToolsModItems.WITHERSWORD);
                _setstack.setCount(1);
                _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (_entity instanceof ServerPlayer _serverPlayer)
                    _serverPlayer.getInventory().setChanged();
            }
        }
    }
}
