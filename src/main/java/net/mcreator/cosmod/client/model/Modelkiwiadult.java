package net.mcreator.cosmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelkiwiadult<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cosmod", "modelkiwiadult"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart leftleg;
	public final ModelPart rightleg;

	public Modelkiwiadult(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild(
				"head", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -2.3F, -3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(14, 12).addBox(-0.5F, -0.3F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0F, -1.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.3F, 0.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -1.0F));
		PartDefinition leftleg = partdefinition
				.addOrReplaceChild(
						"leftleg", CubeListBuilder.create().texOffs(0, 2).addBox(1.0F, -2.3F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(0, 0).addBox(1.0F, -0.3F, 1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition rightleg = partdefinition
				.addOrReplaceChild(
						"rightleg", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.3F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(0, 2).addBox(-2.0F, -0.3F, 1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		leftleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
