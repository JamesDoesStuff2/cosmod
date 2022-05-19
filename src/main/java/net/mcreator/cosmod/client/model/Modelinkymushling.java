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
public class Modelinkymushling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cosmod", "modelinkymushling"), "main");
	public final ModelPart rightfoot;
	public final ModelPart leftfoot;
	public final ModelPart head;
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart body;

	public Modelinkymushling(ModelPart root) {
		this.rightfoot = root.getChild("rightfoot");
		this.leftfoot = root.getChild("leftfoot");
		this.head = root.getChild("head");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rightfoot = partdefinition.addOrReplaceChild("rightfoot",
				CubeListBuilder.create().texOffs(0, 18).addBox(-5.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 23.0F, 0.0F));
		PartDefinition leftfoot = partdefinition.addOrReplaceChild("leftfoot",
				CubeListBuilder.create().texOffs(0, 15).addBox(3.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 23.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(32, 27).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(30, 15)
						.addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, -7.0F, -6.0F, 12.0F,
								3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone = head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(2, 27).addBox(5.0F, -5.0F, -6.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 30)
						.addBox(3.0F, -5.0F, -6.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
						.addBox(4.0F, -5.0F, -6.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-5.0F, -5.0F, -6.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 28)
						.addBox(-6.0F, -5.0F, -6.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 17)
						.addBox(-4.0F, -5.0F, -6.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 12.0F));
		PartDefinition bone2 = head.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(28, 26).addBox(-6.0F, -5.0F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 20)
						.addBox(-6.0F, -5.0F, -5.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 17)
						.addBox(-6.0F, -5.0F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 14)
						.addBox(-6.0F, -5.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-6.0F, -5.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 26)
						.addBox(-6.0F, -5.0F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 23)
						.addBox(-6.0F, -5.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 26)
						.addBox(-6.0F, -5.0F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 14)
						.addBox(-6.0F, -5.0F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 5)
						.addBox(-6.0F, -5.0F, 5.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition bone3 = head.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(10, 10).addBox(-6.0F, -5.0F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-6.0F, -5.0F, -5.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-6.0F, -5.0F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-6.0F, -5.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-6.0F, -5.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 26)
						.addBox(-6.0F, -5.0F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 10)
						.addBox(-6.0F, -5.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 20)
						.addBox(-6.0F, -5.0F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-6.0F, -5.0F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 5)
						.addBox(-6.0F, -5.0F, 5.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, 1.0F, 0.0F));
		PartDefinition bone4 = head.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(8, 20).addBox(5.0F, -5.0F, -6.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(3.0F, -5.0F, -6.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 16)
						.addBox(4.0F, -5.0F, -6.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-5.0F, -5.0F, -6.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -5.0F, -6.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 15)
						.addBox(-4.0F, -5.0F, -6.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 30)
						.addBox(1.0F, -5.0F, -6.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 21)
						.addBox(0.0F, -5.0F, -6.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 27)
						.addBox(-1.0F, -5.0F, -6.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-2.0F, -5.0F, -6.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(-3.0F, 18.0F, 0.0F));
		PartDefinition cube_r1 = leftarm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(5.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(2.0F, 18.0F, 0.0F));
		PartDefinition cube_r2 = rightarm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 6).addBox(-7.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 27).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		rightfoot.render(poseStack, buffer, packedLight, packedOverlay);
		leftfoot.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftarm.render(poseStack, buffer, packedLight, packedOverlay);
		rightarm.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leftfoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightfoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
