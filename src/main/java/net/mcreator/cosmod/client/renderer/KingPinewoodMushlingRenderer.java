
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.KingPinewoodMushlingEntity;
import net.mcreator.cosmod.client.model.Modelking_pinewood_mushling;

public class KingPinewoodMushlingRenderer extends MobRenderer<KingPinewoodMushlingEntity, Modelking_pinewood_mushling<KingPinewoodMushlingEntity>> {
	public KingPinewoodMushlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelking_pinewood_mushling(context.bakeLayer(Modelking_pinewood_mushling.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KingPinewoodMushlingEntity entity) {
		return new ResourceLocation("cosmod:textures/boletuspinophilus.png");
	}
}
