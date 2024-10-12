package net.hydra.jojomod.entity.stand;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Unique;

public class StarPlatinumEntity extends StandEntity {

    public StarPlatinumEntity(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world);
    }
    @Unique
    private static final EntityDataAccessor<Float> FINGER_LENGTH = SynchedEntityData.defineId(StarPlatinumEntity.class,
            EntityDataSerializers.FLOAT);

    public final AnimationState timeStopAnimationState = new AnimationState();
    public final AnimationState timeStopReleaseAnimation = new AnimationState();
    public final AnimationState blockGrabAnimation = new AnimationState();
    public final AnimationState blockThrowAnimation = new AnimationState();
    public final AnimationState itemGrabAnimation = new AnimationState();
    public final AnimationState itemThrowAnimation = new AnimationState();
    public final AnimationState blockRetractAnimation = new AnimationState();
    public final AnimationState itemRetractAnimation = new AnimationState();
    public final AnimationState entityGrabAnimation = new AnimationState();
    public final AnimationState hideFists = new AnimationState();
    public final AnimationState impale = new AnimationState();
    public final AnimationState starFinger = new AnimationState();
    @Override
    protected void setupAnimationStates() {
        super.setupAnimationStates();
        if (this.getUser() != null) {
            if (this.getAnimation() != 12) {
                this.hideFists.startIfStopped(this.tickCount);
            } else {
                this.hideFists.stop();
            }
            if (this.getAnimation() == 10) {
                this.blockLoinAnimationState.startIfStopped(this.tickCount);
            } else {
                this.blockLoinAnimationState.stop();
            }
            if (this.getAnimation() == 30) {
                this.timeStopAnimationState.startIfStopped(this.tickCount);
            } else {
                this.timeStopAnimationState.stop();
            }
            if (this.getAnimation() == 31) {
                this.timeStopReleaseAnimation.startIfStopped(this.tickCount);
            } else {
                this.timeStopReleaseAnimation.stop();
            }
            if (this.getAnimation() == 32) {
                this.blockGrabAnimation.startIfStopped(this.tickCount);
            } else {
                this.blockGrabAnimation.stop();
            }
            if (this.getAnimation() == 33) {
                this.blockThrowAnimation.startIfStopped(this.tickCount);
            } else {
                this.blockThrowAnimation.stop();
            }
            if (this.getAnimation() == 34) {
                this.itemGrabAnimation.startIfStopped(this.tickCount);
            } else {
                this.itemGrabAnimation.stop();
            }
            if (this.getAnimation() == 35) {
                this.itemThrowAnimation.startIfStopped(this.tickCount);
            } else {
                this.itemThrowAnimation.stop();
            }

            if (this.getAnimation() == 36) {
                this.blockRetractAnimation.startIfStopped(this.tickCount);
            } else {
                this.blockRetractAnimation.stop();
            }

            if (this.getAnimation() == 37) {
                this.itemRetractAnimation.startIfStopped(this.tickCount);
            } else {
                this.itemRetractAnimation.stop();
            }

            if (this.getAnimation() == 38) {
                this.entityGrabAnimation.startIfStopped(this.tickCount);
            } else {
                this.entityGrabAnimation.stop();
            }

            if (this.getAnimation() == 81) {
                this.impale.startIfStopped(this.tickCount);
            } else {
                this.impale.stop();
            }

            if (this.getAnimation() == 82) {
                this.starFinger.startIfStopped(this.tickCount);
            } else {
                this.starFinger.stop();
            }
        }
    }

    public final void setFingerLength(float length) {
        this.entityData.set(FINGER_LENGTH, length);
    }

    public final float getFingerLength() {
        return this.entityData.get(FINGER_LENGTH);
    }
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(FINGER_LENGTH, 1F);
    }

    public int tsReleaseTime = 0;
    @Override
    public void tick(){
        if (!this.level().isClientSide){
            if (this.getAnimation() == 31) {
                tsReleaseTime++;
                if (tsReleaseTime > 24){
                    this.setAnimation((byte) 0);
                    tsReleaseTime = 0;
                }
            }
        }
        super.tick();
    }

}
