
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.LeekSpriteEntity;
import net.mcreator.cosmod.client.model.Modelleek_sprite;

public class LeekSpriteRenderer extends MobRenderer<LeekSpriteEntity, Modelleek_sprite<LeekSpriteEntity>> {
	public LeekSpriteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelleek_sprite(context.bakeLayer(Modelleek_sprite.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LeekSpriteEntity entity) {
		return new ResourceLocation("cosmod:textures/leeksprite.png");
	}
}
