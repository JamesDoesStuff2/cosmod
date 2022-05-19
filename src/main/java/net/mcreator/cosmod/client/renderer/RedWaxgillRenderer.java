
package net.mcreator.cosmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cosmod.entity.RedWaxgillEntity;
import net.mcreator.cosmod.client.model.Modelred_waxgill;

public class RedWaxgillRenderer extends MobRenderer<RedWaxgillEntity, Modelred_waxgill<RedWaxgillEntity>> {
	public RedWaxgillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelred_waxgill(context.bakeLayer(Modelred_waxgill.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedWaxgillEntity entity) {
		return new ResourceLocation("cosmod:textures/hygrocyberubrocarnosa.png");
	}
}
