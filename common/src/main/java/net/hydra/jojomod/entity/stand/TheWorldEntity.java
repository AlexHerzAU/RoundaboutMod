package net.hydra.jojomod.entity.stand;

import net.hydra.jojomod.sound.ModSounds;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class TheWorldEntity extends StandEntity {
    public TheWorldEntity(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world);
    }
    @Override
    protected SoundEvent getSummonSound() {
        return ModSounds.WORLD_SUMMON_SOUND_EVENT;
    }

}
