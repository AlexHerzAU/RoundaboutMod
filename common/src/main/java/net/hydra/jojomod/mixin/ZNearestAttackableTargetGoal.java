package net.hydra.jojomod.mixin;

import net.hydra.jojomod.access.IPlayerEntity;
import net.hydra.jojomod.entity.stand.StandEntity;
import net.hydra.jojomod.event.index.ShapeShifts;
import net.hydra.jojomod.event.powers.StandUser;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;
import java.util.List;

@Mixin(NearestAttackableTargetGoal.class)
public abstract class ZNearestAttackableTargetGoal<T extends LivingEntity> extends TargetGoal {
    public ZNearestAttackableTargetGoal(Mob $$0, boolean $$1) {
        super($$0, $$1);
    }


    @Shadow
    @Final
    private static int DEFAULT_RANDOM_INTERVAL = 10;
    @Shadow
    @Final
    protected Class<T> targetType;
    @Shadow
    @Final
    protected int randomInterval;
    @Shadow
    @Nullable
    protected LivingEntity target;
    @Shadow
    protected TargetingConditions targetConditions;

    @Unique
    protected LivingEntity roundabout$target;

    @Shadow
    protected AABB getTargetSearchArea(double $$0) {
        return null;
    }

    @Inject(method = "start", at = @At(value = "HEAD"),cancellable = true)
    protected void roundabout$start(CallbackInfo ci) {
        if (this.mob instanceof Zombie ZE && target instanceof Player $$0){
            IPlayerEntity ple = ((IPlayerEntity) $$0);
            byte shape = ple.roundabout$getShapeShift();
            ShapeShifts shift = ShapeShifts.getShiftFromByte(shape);
            if (shift != ShapeShifts.PLAYER) {
                if (shift == ShapeShifts.ZOMBIE) {
                    target = null;
                    ZE.setLastHurtByPlayer(null);
                    ZE.setLastHurtByMob(null);
                    ZE.setTarget(null);
                }
            }
        } else if (this.mob instanceof Skeleton ZE && target instanceof Player $$0){
            IPlayerEntity ple = ((IPlayerEntity) $$0);
            byte shape = ple.roundabout$getShapeShift();
            ShapeShifts shift = ShapeShifts.getShiftFromByte(shape);
            if (shift != ShapeShifts.PLAYER) {
                if (shift == ShapeShifts.SKELETON) {
                    target = null;
                    ZE.setLastHurtByPlayer(null);
                    ZE.setLastHurtByMob(null);
                    ZE.setTarget(null);
                }
            }
        }
    }
    @Inject(method = "findTarget", at = @At(value = "TAIL"))
    protected void roundabout$findTarget(CallbackInfo ci) {
        if (this.target instanceof StandEntity SE) {
            if(SE.getFollowing() != null && !(SE.getFollowing() instanceof StandEntity)){
                if (SE.getFollowing() instanceof ServerPlayer PE && !PE.gameMode.isCreative() && !PE.isSpectator()){
                    this.target = PE;
                } else {
                    this.target = null;
                }
            } else if(SE.getUser() != null){
                if (SE.getUser() instanceof ServerPlayer PE && !PE.gameMode.isCreative() && !PE.isSpectator()){
                    this.target = PE;
                } else {
                    this.target = null;
                }
            }
        }
    }
}
