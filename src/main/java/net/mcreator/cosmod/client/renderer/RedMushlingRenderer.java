
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.RedMushlingEntity;
import net.mcreator.cosmod.client.model.Modelredmushling;

public class RedMushlingRenderer extends MobRenderer<RedMushlingEntity, Modelredmushling<RedMushlingEntity>> {
	public RedMushlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelredmushling(context.bakeLayer(Modelredmushling.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedMushlingEntity entity) {
		return new ResourceLocation("cosmod:textures/redmushling.png");
	}
}
