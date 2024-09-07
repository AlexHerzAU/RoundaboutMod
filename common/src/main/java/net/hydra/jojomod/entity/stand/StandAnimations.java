package net.hydra.jojomod.entity.stand;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class StandAnimations {
    /**This file contains common animations that most humanoid stands will use.*/
    public static final AnimationDefinition STAND_IDLE_FLOAT = net.minecraft.client.animation.AnimationDefinition.Builder.withLength(3.0f).looping()
            .addAnimation("stand2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0698F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5F, KeyframeAnimations.posVec(0.0698F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3.0F, KeyframeAnimations.posVec(-0.0698F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(-0.2967F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5F, KeyframeAnimations.posVec(-0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3.0F, KeyframeAnimations.posVec(-0.2967F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0698F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5F, KeyframeAnimations.posVec(0.0698F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3.0F, KeyframeAnimations.posVec(-0.0698F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(-0.2617F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5F, KeyframeAnimations.posVec(-0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3.0F, KeyframeAnimations.posVec(-0.2617F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(-0.3054F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5F, KeyframeAnimations.posVec(-0.3926F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3.0F, KeyframeAnimations.posVec(-0.3054F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.7417F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.2617F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5F, KeyframeAnimations.posVec(0.1308F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3.0F, KeyframeAnimations.posVec(0.2617F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.6544F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .build();

    public static final AnimationDefinition GRAB_BLOCK = AnimationDefinition.Builder.withLength(0.5F)
            .addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.9992F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("upper_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5F, KeyframeAnimations.degreeVec(-145.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.9997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5F, KeyframeAnimations.degreeVec(-164.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.POSITION,
                    new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.0417F, KeyframeAnimations.posVec(0.0F, 0.33F, -1.23F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, 0.71F, -2.37F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 1.39F, -3.16F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 2.1F, -3.61F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 3.09F, -4.5F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 4.08F, -5.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.2917F, KeyframeAnimations.posVec(0.0F, 5.07F, -5.37F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.3333F, KeyframeAnimations.posVec(0.0F, 6.06F, -5.35F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 7.05F, -5.2F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, 8.53F, -4.88F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 10.0F, -2.75F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.9992F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5F, KeyframeAnimations.degreeVec(-149.4113F, 4.8566F, -8.1525F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.4944F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-17.4993F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.4963F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .build();


    public static final AnimationDefinition THROW_BLOCK = AnimationDefinition.Builder.withLength(0.1667F)
            .addAnimation("body2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.0833F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-149.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.125F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-3.9992F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.9997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-16.9997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-149.0F, 4.8566F, -8.1525F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.125F, KeyframeAnimations.degreeVec(-30.0F, 4.86F, -8.15F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-3.9992F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.4944F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-17.4993F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.4963F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .build();

    public static final AnimationDefinition RETRACT_BLOCK = AnimationDefinition.Builder.withLength(0.1667F)
            .addAnimation("body2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-149.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.125F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-3.9992F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.9997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-16.9997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-149.0F, 4.8566F, -8.1525F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-3.9992F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.4944F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-17.4993F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.4963F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .build();
        public static final AnimationDefinition GRAB_ITEM = AnimationDefinition.Builder.withLength(0.2917F)
                .addAnimation("body2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2917F, KeyframeAnimations.degreeVec(0.0F, -25.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("upper_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 67.5F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 50.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2083F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 50.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.25F, KeyframeAnimations.degreeVec(-65.733F, 13.3486F, 22.8823F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-69.0031F, 18.177F, 10.8959F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.9997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.125F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 70.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-64.1946F, -6.8638F, 56.6304F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2083F, KeyframeAnimations.degreeVec(-102.2388F, -5.8264F, 61.5518F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.25F, KeyframeAnimations.degreeVec(-142.6409F, -20.0581F, 89.1316F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-162.6027F, -14.8564F, 95.4627F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.POSITION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.125F, KeyframeAnimations.posVec(-3.75F, 5.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.1667F, KeyframeAnimations.posVec(-3.5F, 3.75F, -2.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2083F, KeyframeAnimations.posVec(-3.5F, 3.75F, -3.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.25F, KeyframeAnimations.posVec(-1.5F, 4.5F, -5.25F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2917F, KeyframeAnimations.posVec(-1.5F, 4.5F, -4.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.4944F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-17.4993F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.4963F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition THROW_ITEM = AnimationDefinition.Builder.withLength(0.625F)
                .addAnimation("body2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -25.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2083F, KeyframeAnimations.degreeVec(0.0F, 30.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("upper_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.0031F, 18.177F, 10.8959F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.0417F, KeyframeAnimations.degreeVec(-65.733F, 13.3486F, 22.8823F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.0833F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 50.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.125F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 50.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 67.5F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2083F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 90.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.4167F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 90.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 90.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-162.6027F, -14.8564F, 95.4627F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.0417F, KeyframeAnimations.degreeVec(-142.6409F, -20.0581F, 89.1316F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.0833F, KeyframeAnimations.degreeVec(-102.2388F, -5.8264F, 61.5518F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.125F, KeyframeAnimations.degreeVec(-64.1946F, -6.8638F, 56.6304F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 70.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2083F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 90.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.4167F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 90.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 90.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 70.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 42.5F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.5833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.5F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.625F, KeyframeAnimations.degreeVec(-16.9997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.POSITION,
			new Keyframe(0.0F, KeyframeAnimations.posVec(-1.5F, 4.5F, -4.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.0417F, KeyframeAnimations.posVec(-1.5F, 4.5F, -5.25F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.0833F, KeyframeAnimations.posVec(-3.5F, 3.75F, -3.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.125F, KeyframeAnimations.posVec(-3.5F, 3.75F, -2.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.1667F, KeyframeAnimations.posVec(-3.75F, 5.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.2083F, KeyframeAnimations.posVec(-2.5F, 7.5F, 2.75F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.4167F, KeyframeAnimations.posVec(-3.0F, 7.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.4583F, KeyframeAnimations.posVec(-3.5F, 7.5F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.5F, KeyframeAnimations.posVec(-3.75F, 5.25F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.5417F, KeyframeAnimations.posVec(-3.25F, 3.0F, -0.25F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.5833F, KeyframeAnimations.posVec(-2.0F, 1.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.4944F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-17.4993F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("lower_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.4963F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();


    public static final AnimationDefinition RETRACT_ITEM = AnimationDefinition.Builder.withLength(0.625F)
            .addAnimation("body2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -25.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("upper_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.0031F, 18.177F, 10.8959F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-162.6027F, -14.8564F, 95.4627F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.625F, KeyframeAnimations.degreeVec(-16.9997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.POSITION,
                    new Keyframe(0.0F, KeyframeAnimations.posVec(-1.5F, 4.5F, -4.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.9943F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.4944F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-17.4993F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.4963F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .build();
    public static final AnimationDefinition STAND_LEAP = AnimationDefinition.Builder.withLength(0.25F)
            .addAnimation("head2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("body2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.00F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.posVec(-0.2967F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.posVec(-0.2617F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.00F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.2083F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .build();

    public static final AnimationDefinition STAND_LEAP_END = AnimationDefinition.Builder.withLength(0.25F)
            .addAnimation("head2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0417F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("body2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.posVec(-0.2967F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.posVec(-0.2617F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.posVec(0.2617F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.posVec(0.6544F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.degreeVec(-20F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .addAnimation("lower_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F, KeyframeAnimations.posVec(0.7417F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
            ))
            .build();

    public static final AnimationDefinition COMBO1 = AnimationDefinition.Builder.withLength(0.4583433f)
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(5f, 9f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(4.96f, 5.02f, -0.35f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(7.96f, 5.02f, -0.35f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(7.96f, 5.02f, -0.35f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(8.95f, 4.02f, -0.4f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.4583433f, KeyframeAnimations.degreeVec(8.95f, -3.97f, -0.81f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.08343333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, -2f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(0f, 0f, 30f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(-91.2f, 11.09f, -0.15f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-88.96f, 10.09f, -0.19f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.08343333f, KeyframeAnimations.posVec(0f, 0.05f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(-2f, 3f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(-1.25f, 3f, -4.48f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(-1.02f, 3.65f, -4.56f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-62.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(-72.96f, -16.22f, 2.15f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-90.92f, -2.23f, 1.92f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0.08343333f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(0f, 0f, -4f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(-11f, 0f, -11f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.041676664f, KeyframeAnimations.posVec(0.4f, 0.4f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.posVec(1.1f, 1.1f, -1.2f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(0f, 0f, 3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(-11f, 0f, 3f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0f, -1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(0f, 0f, -0.5f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(-4f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(-3f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.08343333f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0f, -0.6f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0.3f, -0.4f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(0f, 0.6f, -0.3f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(4.78f, 1.21f, -0.79f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(11.78f, 1.21f, -0.79f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(-7f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-23f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0.5f, -0.7f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 2.1f, -2.7f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(25f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("torso",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, 25f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 22.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, KeyframeAnimations.degreeVec(0f, -12.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("legs",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(0f, 8f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, 19f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 28f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 14f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, -6f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(0f, -16.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, KeyframeAnimations.degreeVec(0f, -6f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("stand2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("stand2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("top",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition COMBO2 = AnimationDefinition.Builder.withLength(0.375f)
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(8.95f, -3.97f, -0.81f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(12.24f, -14.84f, -2.57f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(7.86f, -4.08f, -0.25f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(4.84f, 1.87f, 0.57f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-0.15f, 3.86f, 0.74f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(0f, -1f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-57.7f, 11.09f, -0.15f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(-39.7f, 11.09f, -0.15f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-32.35f, 21.36f, 15.28f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(-10.15f, 22.99f, 23.74f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(-1.12f, 1.85f, -3.06f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(-1.12f, 1.75f, -3.46f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(-0.82f, 0.55f, -2.46f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(-2.15f, 0.62f, -1.98f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(-1.92f, 0.65f, -0.96f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(-2.22f, 0.15f, 0.24f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-75.92f, -2.23f, 1.92f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(-68.92f, -2.23f, 1.92f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-67.11f, -3.87f, 1.31f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(-69.93f, 1.53f, 3.29f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-81.69f, -8.8f, -0.51f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, -0.7f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(0f, -1.3f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0.2f, -2.3f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(20.22f, -5.05f, -38.07f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(6.22f, -5.05f, -38.07f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-37.02f, -4.38f, -35.13f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(-38.11f, -12.23f, -41.41f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-69.71f, -14.2f, -37.09f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(2.4f, 3.1f, 2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(2.6f, 3.1f, 2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(2.5f, 2.7f, 1.1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(1.9f, 3.1f, -2.7f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(2.9f, 2.8f, -2.7f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(1.9f, 3.9f, -4.2f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-36f, 0f, 3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(-35.66f, -5.28f, -4.3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-59.39f, 8.81f, -27.41f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-79.69f, -14.56f, -35.12f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, 0.3f, -0.3f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(16f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, 1.2f, 1.5f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(32.78f, 1.21f, -0.79f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(-6f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, 0.6f, -0.9f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(7f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("torso",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, -12.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, -22.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("legs",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -6f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, -20f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, -6f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, -17f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, -4f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 12f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, 59f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition COMBO3 = AnimationDefinition.Builder.withLength(0.375f)
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.08343333f, KeyframeAnimations.posVec(0f, -0.3f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(-6.15f, 3.86f, 0.74f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(1.5f, 2.21f, 2.81f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-2.85f, 0.56f, 4.89f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, -1.82f, -0.7f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, -1.2f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(-24.16f, 48.93f, 44.15f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-53.7f, 47.51f, 22.28f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(-100.81f, 20.49f, -9.6f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(-3.92f, 2.25f, 0.24f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, KeyframeAnimations.posVec(-3.55f, 2.52f, 0.01f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(-3.18f, 2.89f, -0.09f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(-4f, 2.95f, 0.54f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(-3.74f, 2.65f, -1.76f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(-1.83f, 4.45f, -4.06f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(-1.72f, 4.75f, -3.46f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-81.69f, -8.8f, -0.51f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(-90.92f, -8.77f, 30.84f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(-97.76f, -4.21f, 56.73f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(-106.64f, -34.62f, 71.62f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-99.76f, 3.59f, 35.17f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(-105.32f, 17.42f, -6.13f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-122.57f, 8.06f, -3.55f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0.2f, -2.3f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-69.71f, -14.2f, -37.09f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-30.06f, -7.41f, -24.61f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(1.9f, 3.9f, -4.2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(1.9f, -0.3f, -0.9f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-79.69f, -14.56f, -35.12f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-96.12f, -12.18f, -25.03f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(-3f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-16f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 1.2f, -0.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 1.5f, -2.1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(17.78f, 1.21f, -0.79f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(3.78f, 1.21f, -0.79f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0.4f, -0.6f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(16f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(29f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 1.5f, 2.4f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(54f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 59f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.125f, KeyframeAnimations.degreeVec(19.54f, 57.15f, 14.75f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(10.52f, -6.22f, -3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.375f, KeyframeAnimations.degreeVec(11.36f, -22.91f, -6.32f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("stand2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(1f, 0f, -2.1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("stand2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(6f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(10.44f, 0.86f, -6.95f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(10.94f, 0.83f, -7.96f),
                                    AnimationChannel.Interpolations.LINEAR))).build();

    public static final AnimationDefinition BLOCK = AnimationDefinition.Builder.withLength(0.25f)
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(0f, -0.3f, -2.3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, -0.3f, -2.3f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("torso",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(0f, -0.4f, -2.6f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("torso",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(12f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-58.57f, -25.05f, 9.34f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-90f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-58.57f, 25.05f, -9.34f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-90f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("legs",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-4f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(72f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(21f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(72f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();

    public static final AnimationDefinition BLOCKBREAK = AnimationDefinition.Builder.withLength(0.25f)
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -0.3f, -2.3f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2f, KeyframeAnimations.degreeVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("torso",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -0.4f, -2.6f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("torso",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(12f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-58.57f, -25.05f, 9.34f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-33.83f, 35.75f, 38.44f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-90f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-58.57f, 25.05f, -9.34f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-33.83f, -35.75f, -38.44f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-90f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("legs",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-4f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(14.06f, 0.69f, 9.98f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(72f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(71.79f, -8.56f, 2.8f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(21f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(11.65f, 2.88f, -13.71f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(72f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(100f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("stand2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2f, KeyframeAnimations.degreeVec(-9f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();

    public static final AnimationDefinition TIMESTOP = AnimationDefinition.Builder.withLength(2f)
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, -0.4f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0.5f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(21f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-17.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-7.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_chest",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(10f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-9f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-18.09f, -14.12f, 18.2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(0.64f, 10.27f, 51.96f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-88f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-19.14f, 9.53f, 4.98f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(6.91f, 14.12f, -18.2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(0.64f, -10.27f, -51.96f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-88f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-19.14f, -9.53f, -4.98f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_chest",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("legs",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, -0.9f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("legs",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(19f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-63.06f, -5.74f, 11.13f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-25.18f, -4.47f, 9.29f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(112.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(25.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-39.28f, -4.02f, -6.34f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-25.53f, -1.04f, -9.29f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(80f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(25.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();

    public static final AnimationDefinition BARRAGE = AnimationDefinition.Builder.withLength(0.3433333f).looping()
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(9.96f, -0.87f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(9.96f, 0.87f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(9.96f, -0.87f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(9.96f, -0.87f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(24.97f, -0.16f, 52.49f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(-91.17f, -19.23f, 10.41f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(7.9f, 1.25f, 8.91f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(24.97f, -0.16f, 52.49f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(-0.1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(-0.1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-85f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(-6f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-65f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-85f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(7.9f, 1.25f, -8.91f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(24.97f, -0.16f, -52.49f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-91.17f, 19.23f, -10.41f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(7.9f, 1.25f, -8.91f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(0.1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-65f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-85f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-6f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-65f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("legs",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-47f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(65f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(22f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(18f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(8.17f, 11.24f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(8.17f, -11.24f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(8.17f, -11.24f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(8.17f, 11.24f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition BARRAGECHARGE = AnimationDefinition.Builder.withLength(1f)
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -0.3f, -2.3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, KeyframeAnimations.posVec(0f, -0.3f, -2.3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, -0.3f, -2.3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(0f, -0.3f, -2.3f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(14f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(21f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("torso",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -0.4f, -2.6f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("torso",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(12f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_chest",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_chest",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.625f, KeyframeAnimations.degreeVec(8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-58.57f, -25.05f, 9.34f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.625f, KeyframeAnimations.degreeVec(19f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(31.73f, -3.24f, 9.47f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-90f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, KeyframeAnimations.degreeVec(-62f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-58.57f, 25.05f, -9.34f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.625f, KeyframeAnimations.degreeVec(27f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(41.65f, 4.52f, -8.93f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-90f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, KeyframeAnimations.degreeVec(-73f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_torso",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_torso",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.625f, KeyframeAnimations.degreeVec(-2f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("legs",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("legs",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.625f, KeyframeAnimations.degreeVec(-3f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-4f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.625f, KeyframeAnimations.degreeVec(-7f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(72f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.625f, KeyframeAnimations.degreeVec(19f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(21f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0.20834334f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.625f, KeyframeAnimations.degreeVec(33f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();

    public static final AnimationDefinition BARRAGEDAMAGE = AnimationDefinition.Builder.withLength(2.25f).looping()
            .addAnimation("stand2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-6.97f, 0.61f, 4.96f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-1.06f, -4.55f, -3.94f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(2.32f, 5.3f, 0.41f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-2.51f, 22.28f, 1.14f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(2.64f, 10.29f, 1.67f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(-2.34f, -13.88f, -3.55f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(-5.6f, -28.87f, -2.86f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(-11.38f, 6.4f, -1.07f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-18.38f, 6.4f, -1.07f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(-10.49f, -10.32f, 2f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -0.4f, -1.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, -0.9f, 0.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(0f, -0.4f, -1.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.posVec(-0.5f, -1.1f, 0.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.posVec(0f, -0.4f, -1.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.posVec(0.5f, -1.1f, 0.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.posVec(0f, -0.4f, -1.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, -0.9f, 0.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.posVec(0f, -0.4f, -1.8f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-43f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(11.24f, -21.97f, -1.21f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(11.24f, 21.97f, 1.21f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-43f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(-8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-8.32f, -15.84f, 2.29f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(-8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(-8.32f, 15.84f, 2.29f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(-8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(-8f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_chest",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, -0.6f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.posVec(0f, -0.6f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.posVec(0f, -0.6f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, -0.6f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper_chest",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(16f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-14f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(16f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-14f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(16f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(16f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(-14f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(16f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-14f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(16f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 35f, 20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 35f, 20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 35f, 20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(0f, 35f, 20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(0f, 35f, 20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(0f, 35f, 20f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-23f, 0f, -18f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(-23f, 0f, -18f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(-23f, 0f, -18f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(-23f, 0f, -18f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(-23f, 0f, -18f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -35f, -20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -35f, -20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(12.84f, -32.84f, -42.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(0f, -35f, -20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(12.84f, -32.84f, -42.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(0f, -35f, -20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(0f, -35f, -20f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_arm",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-23f, 0f, 18f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(-23f, 0f, 18f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-23f, 0f, 18f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(-23f, 0f, 18f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(-23f, 0f, 18f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(-23f, 0f, 18f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-10f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-18f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(-10f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(17f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-10f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(-10f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(-17f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(-10f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-10f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(-10f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_right_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-10f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-17f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(-10f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(-17f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-10f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(-10f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(10f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(-10f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-17f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(-10f, 0f, -10f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower_left_leg",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.75f, KeyframeAnimations.degreeVec(31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.25f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.5f, KeyframeAnimations.degreeVec(31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.75f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(31f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();

}
