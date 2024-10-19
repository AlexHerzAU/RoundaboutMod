package net.hydra.jojomod.registry;

import net.hydra.jojomod.event.ModGamerules;
import net.minecraft.world.level.GameRules;

public class ForgeGamerules {
    public static void registerGamerules(){
        ModGamerules.ROUNDABOUT_STAND_GRIEFING = GameRules.register("roundaboutStandGriefing",
                GameRules.Category.MISC, GameRules.BooleanValue.create(true));
        ModGamerules.ROUNDABOUT_ALLOW_ENTITY_GRAB = GameRules.register("roundaboutMobGrabbing",
                GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
        ModGamerules.ROUNDABOUT_WORTHY_MOB_SPAWNS = GameRules.register("roundaboutSpawnWorthyMobs",
                GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
        ModGamerules.ROUNDABOUT_STAND_USER_MOB_SPAWNS = GameRules.register("roundaboutSpawnStandUserMobs",
                GameRules.Category.MOBS,GameRules.BooleanValue.create(true));
    }
}
