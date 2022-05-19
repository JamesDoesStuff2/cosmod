
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.RadishSpiritEntity;
import net.mcreator.cosmod.client.model.Modelradishspirit;

public class RadishSpiritRenderer extends MobRenderer<RadishSpiritEntity, Modelradishspirit<RadishSpiritEntity>> {
	public RadishSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelradishspirit(context.bakeLayer(Modelradishspirit.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(RadishSpiritEntity entity) {
		return new ResourceLocation("cosmod:textures/radishspirit.png");
	}
}
