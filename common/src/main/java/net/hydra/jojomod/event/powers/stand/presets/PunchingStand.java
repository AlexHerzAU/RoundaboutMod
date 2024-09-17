package net.hydra.jojomod.event.powers.stand.presets;

import net.hydra.jojomod.event.index.OffsetIndex;
import net.hydra.jojomod.event.index.PowerIndex;
import net.hydra.jojomod.event.powers.DamageHandler;
import net.hydra.jojomod.event.powers.StandPowers;
import net.hydra.jojomod.event.powers.StandUser;
import net.hydra.jojomod.networking.ModPacketHandler;
import net.hydra.jojomod.sound.ModSounds;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public class PunchingStand extends StandPowers {
    public PunchingStand(LivingEntity self) {
        super(self);
    }
    @Override
    public boolean canSummonStand(){
        return true;
    }


    @Override
    public boolean interceptAttack(){
        return true;
    }
    @Override
    public boolean interceptGuard(){
        return true;
    }

    @Override
    public boolean isMiningStand() {
        return true;
    }
    @Override
    public float getMiningSpeed() {
        return 5F;
    }

    @Override
    public boolean setPowerAttack(){
        if (this.attackTimeDuring <= -1) {
            if (this.activePowerPhase < this.activePowerPhaseMax || this.attackTime >= this.attackTimeMax) {
                if (this.activePowerPhase >= this.activePowerPhaseMax){
                    this.activePowerPhase = 1;
                } else {
                    this.activePowerPhase++;
                    if (this.activePowerPhase == this.activePowerPhaseMax) {
                        this.attackTimeMax= 40;
                    } else {
                        this.attackTimeMax= 30;
                    }

                }

                this.attackTimeDuring = 0;
                this.setActivePower(PowerIndex.ATTACK);
                this.setAttackTime(0);

                animateStand(this.activePowerPhase);
                poseStand(OffsetIndex.ATTACK);
                return true;
            }
        }
        return false;
    }

    @Override
    public void updateAttack(){
        if (this.attackTimeDuring > -1) {
            if (this.attackTimeDuring > this.attackTimeMax) {
                this.attackTimeMax = 0;
                ((StandUser) this.getSelf()).tryPower(PowerIndex.NONE,true);
            } else {
                if ((this.attackTimeDuring == 5 && this.activePowerPhase == 1)
                        || this.attackTimeDuring == 6) {
                    this.standPunch();
                }
            }
        }
    }
    @Override
    public void punchImpact(Entity entity){
        this.setAttackTimeDuring(-10);
        if (entity != null) {
            float pow;
            float knockbackStrength;
            if (this.getActivePowerPhase() >= this.getActivePowerPhaseMax()) {
                /*The last hit in a string has more power and knockback if you commit to it*/
                pow = getHeavyPunchStrength(entity);
                knockbackStrength = 1F;
            } else {
                pow = getPunchStrength(entity);
                knockbackStrength = 0.2F;
            }
            if (StandDamageEntityAttack(entity, pow, 0, this.self)) {
                this.takeDeterminedKnockback(this.self, entity, knockbackStrength);
            } else {
                if (this.activePowerPhase >= this.activePowerPhaseMax) {
                    knockShield2(entity, 40);
                }
            }
        } else {
            // This is less accurate raycasting as it is server sided but it is important for particle effects
            float distMax = this.getDistanceOut(this.self, this.standReach, false);
            float halfReach = (float) (distMax * 0.5);
            Vec3 pointVec = DamageHandler.getRayPoint(self, halfReach);
            if (!this.self.level().isClientSide) {
                ((ServerLevel) this.self.level()).sendParticles(ParticleTypes.EXPLOSION, pointVec.x, pointVec.y, pointVec.z,
                        1, 0.0, 0.0, 0.0, 1);
            }
        }

        SoundEvent SE;
        float pitch = 1F;
        if (this.activePowerPhase >= this.activePowerPhaseMax) {

            if (!this.self.level().isClientSide()) {
                SoundEvent LastHitSound = this.getLastHitSound();
                if (LastHitSound != null) {
                    this.self.level().playSound(null, this.self.blockPosition(), LastHitSound,
                            SoundSource.PLAYERS, 1F, 1);
                }
            }

            if (entity != null) {
                SE = ModSounds.PUNCH_4_SOUND_EVENT;
                pitch = 1.2F;
            } else {
                SE = ModSounds.PUNCH_2_SOUND_EVENT;
            }
        } else {
            if (entity != null) {
                SE = ModSounds.PUNCH_3_SOUND_EVENT;
                pitch = 1.1F + 0.07F * activePowerPhase;
            } else {
                SE = ModSounds.PUNCH_1_SOUND_EVENT;
            }
        }

        if (!this.self.level().isClientSide()) {
            this.self.level().playSound(null, this.self.blockPosition(), SE, SoundSource.PLAYERS, 0.95F, pitch);
        }
    }

    @Override
    public boolean setPowerBarrageCharge() {
        animateStand((byte) 11);
        this.attackTimeDuring = 0;
        this.setActivePower(PowerIndex.BARRAGE_CHARGE);
        this.poseStand(OffsetIndex.ATTACK);
        this.clashDone = false;
        playBarrageChargeSound();
        return true;
    }

    @Override
    public boolean setPowerBarrage() {
        this.attackTimeDuring = 0;
        this.setActivePower(PowerIndex.BARRAGE);
        this.poseStand(OffsetIndex.ATTACK);
        this.setAttackTimeMax(this.getBarrageRecoilTime());
        this.setActivePowerPhase(this.getActivePowerPhaseMax());
        this.setAttackTime(19);
        animateStand((byte) 12);
        playBarrageCrySound();
        return true;
    }

    public void standPunch(){
        /*By setting this to -10, there is a delay between the stand retracting*/

        if (this.self instanceof Player){
            if (isPacketPlayer()){
                //Roundabout.LOGGER.info("Time: "+this.self.getWorld().getTime()+" ATD: "+this.attackTimeDuring+" APP"+this.activePowerPhase);
                this.attackTimeDuring = -10;
                ModPacketHandler.PACKET_ACCESS.StandPunchPacket(getTargetEntityId(), this.activePowerPhase);
            }
        } else {
            /*Caps how far out the punch goes*/
            Entity targetEntity = getTargetEntity(this.self,-1);
            punchImpact(targetEntity);
        }

    }


}