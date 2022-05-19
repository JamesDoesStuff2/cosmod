package net.mcreator.cosmod.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmoon_staff<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cosmod", "modelmoon_staff"), "main");
	public final ModelPart staff;
	public final ModelPart moon;

	public Modelmoon_staff(ModelPart root) {
		this.staff = root.getChild("staff");
		this.moon = root.getChild("moon");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition staff = partdefinition.addOrReplaceChild("staff",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -9.0F, 7.0F, 1.0F, 25.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 1)
						.addBox(-8.0F, -13.0F, 5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(4, 6)
						.addBox(-8.0F, -21.0F, 5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(-8.0F, -14.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 16)
						.addBox(-8.0F, -14.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 16)
						.addBox(-8.0F, -17.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 12)
						.addBox(-8.0F, -22.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 12)
						.addBox(-8.0F, -12.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 16)
						.addBox(-8.0F, -19.0F, 11.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 16)
						.addBox(-8.0F, -20.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 8)
						.addBox(-8.0F, -20.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 9)
						.addBox(-10.0F, -6.0F, 5.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 7)
						.addBox(-10.0F, -6.0F, 9.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 12)
						.addBox(-6.0F, -6.0F, 6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 12)
						.addBox(-10.0F, -6.0F, 6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 6)
						.addBox(-8.0F, -14.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 6)
						.addBox(-8.0F, -20.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition moon = partdefinition.addOrReplaceChild("moon",
				CubeListBuilder.create().texOffs(4, 0).addBox(-1.0F, -10.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 16.0F, 8.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		staff.render(poseStack, buffer, packedLight, packedOverlay);
		moon.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.moon.yRot = ageInTicks / 20.f;
	}
}
