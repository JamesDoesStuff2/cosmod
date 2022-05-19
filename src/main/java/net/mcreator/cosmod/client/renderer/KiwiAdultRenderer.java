
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.KiwiAdultEntity;
import net.mcreator.cosmod.client.model.Modelkiwiadult;

public class KiwiAdultRenderer extends MobRenderer<KiwiAdultEntity, Modelkiwiadult<KiwiAdultEntity>> {
	public KiwiAdultRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkiwiadult(context.bakeLayer(Modelkiwiadult.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KiwiAdultEntity entity) {
		return new ResourceLocation("cosmod:textures/kiwibird.png");
	}
}
