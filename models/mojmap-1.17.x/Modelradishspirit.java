// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelradishspirit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "radishspirit"), "main");
	private final ModelPart leaves;
	private final ModelPart head;

	public Modelradishspirit(ModelPart root) {
		this.leaves = root.getChild("leaves");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leaves = partdefinition.addOrReplaceChild("leaves", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r1 = leaves.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(28, 15)
						.addBox(-7.0F, -18.0F, 0.0F, 14.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 29)
						.addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = leaves.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-7.0F, -18.0F, 0.0F, 14.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leaves.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leaves.yRot = ageInTicks;
	}
}