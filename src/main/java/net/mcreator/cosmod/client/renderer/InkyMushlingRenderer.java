
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.InkyMushlingEntity;
import net.mcreator.cosmod.client.model.Modelinkymushling;

public class InkyMushlingRenderer extends MobRenderer<InkyMushlingEntity, Modelinkymushling<InkyMushlingEntity>> {
	public InkyMushlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinkymushling(context.bakeLayer(Modelinkymushling.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InkyMushlingEntity entity) {
		return new ResourceLocation("cosmod:textures/inkymushling.png");
	}
}
