package net.hydra.jojomod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.hydra.jojomod.access.IPlayerEntity;
import net.hydra.jojomod.client.StandIcons;
import net.hydra.jojomod.entity.projectile.KnifeEntity;
import net.hydra.jojomod.event.index.LocacacaCurseIndex;
import net.hydra.jojomod.event.powers.StandUser;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.StuckInBodyLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.Nullable;

public class StoneLayer<T extends LivingEntity, M extends HumanoidModel<T>, A extends HumanoidModel<T>> extends RenderLayer<T, M> {
    private final EntityRenderDispatcher dispatcher;

    private final LivingEntityRenderer<T, M> livingEntityRenderer;

    public StoneLayer(EntityRendererProvider.Context context, LivingEntityRenderer<T, M> livingEntityRenderer) {
        super(livingEntityRenderer);
        this.dispatcher = context.getEntityRenderDispatcher();
        this.livingEntityRenderer = livingEntityRenderer;
    }
    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int integ, T var4,
                       float var5, float var6, float var7, float var8, float var9, float var10) {
        byte curse = ((StandUser)var4).roundabout$getLocacacaCurse();
        if (curse > -1) {
            ResourceLocation rl = null;
            if (curse == LocacacaCurseIndex.LEFT_LEG){
                rl = StandIcons.STONE_LEFT_LEG;
            } else if (curse == LocacacaCurseIndex.RIGHT_LEG){
                rl = StandIcons.STONE_RIGHT_LEG;
            } else if (curse == LocacacaCurseIndex.OFF_HAND){
                rl = StandIcons.STONE_LEFT_ARM;
            } else if (curse == LocacacaCurseIndex.MAIN_HAND){
                rl = StandIcons.STONE_RIGHT_ARM;
            } else if (curse == LocacacaCurseIndex.CHEST){
                rl = StandIcons.STONE_CHEST;
            } else if (curse == LocacacaCurseIndex.HEAD){
                rl = StandIcons.STONE_HEAD;
            } else if (curse == LocacacaCurseIndex.HEART){
                rl = StandIcons.STONE_HEART;
            }
            renderPart(poseStack,multiBufferSource,integ,livingEntityRenderer.getModel(),1,1,1,null,
                    rl);
        }
    }

    private void renderPart(
           PoseStack poseStack, MultiBufferSource multiBufferSource, int integ, HumanoidModel<T> $$4,float $$6, float $$7, float $$8, @Nullable String $$9,
           ResourceLocation RL
    ) {
        VertexConsumer $$10 = multiBufferSource.getBuffer(RenderType.armorCutoutNoCull(RL));
        $$4.renderToBuffer(poseStack, $$10, integ, OverlayTexture.NO_OVERLAY, $$6, $$7, $$8, 1.0F);
    }
}
