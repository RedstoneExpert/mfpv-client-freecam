package com.gluecode.fpvdrone.entity;

import com.gluecode.fpvdrone.Main;
import com.mojang.authlib.GameProfile;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DroneEntity extends Entity {
  public DroneEntity(EntityType<? extends Entity> p_i48576_1_, World p_i48576_2_) {
    super(p_i48576_1_, p_i48576_2_);
  }

  @Override
  protected void defineSynchedData() {

  }

  @Override
  protected void readAdditionalSaveData(CompoundNBT p_70037_1_) {

  }

  @Override
  protected void addAdditionalSaveData(CompoundNBT p_213281_1_) {

  }

  @Override
  public IPacket<?> getAddEntityPacket() {
    return null;
  }
  //public DroneEntity(ClientWorld world, GameProfile profile) {
  //  super(world, profile);
  //}
  //  public DroneEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
  //    super(type, worldIn);
  //  }
  
  //  public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
  //    // func_233666_p_() = registerAttributes
  //    return MobEntity.func_233666_p_()
  //        .createMutableAttribute(Attributes.MAX_HEALTH, 20)
  //        .createMutableAttribute(Attributes.MOVEMENT_SPEED, 4.317);
  //  }
}
