
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.MorelMushlingEntity;
import net.mcreator.cosmod.client.model.Modelmorel;

public class MorelMushlingRenderer extends MobRenderer<MorelMushlingEntity, Modelmorel<MorelMushlingEntity>> {
	public MorelMushlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmorel(context.bakeLayer(Modelmorel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MorelMushlingEntity entity) {
		return new ResourceLocation("cosmod:textures/morel.png");
	}
}
