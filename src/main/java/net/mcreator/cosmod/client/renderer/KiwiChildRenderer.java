
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.KiwiChildEntity;
import net.mcreator.cosmod.client.model.Modelkiwichild;

public class KiwiChildRenderer extends MobRenderer<KiwiChildEntity, Modelkiwichild<KiwiChildEntity>> {
	public KiwiChildRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkiwichild(context.bakeLayer(Modelkiwichild.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KiwiChildEntity entity) {
		return new ResourceLocation("cosmod:textures/kiwibirdchild.png");
	}
}
