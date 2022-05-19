
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.BrownMushlingEntity;
import net.mcreator.cosmod.client.model.Modelbrownmushling;

public class BrownMushlingRenderer extends MobRenderer<BrownMushlingEntity, Modelbrownmushling<BrownMushlingEntity>> {
	public BrownMushlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbrownmushling(context.bakeLayer(Modelbrownmushling.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrownMushlingEntity entity) {
		return new ResourceLocation("cosmod:textures/brownmushling.png");
	}
}
