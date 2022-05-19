
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.cosmod.client.renderer.RedWaxgillRenderer;
import net.mcreator.cosmod.client.renderer.RedMushlingRenderer;
import net.mcreator.cosmod.client.renderer.RadishSpiritRenderer;
import net.mcreator.cosmod.client.renderer.MorelMushlingRenderer;
import net.mcreator.cosmod.client.renderer.LeekSpriteRenderer;
import net.mcreator.cosmod.client.renderer.KiwiChildRenderer;
import net.mcreator.cosmod.client.renderer.KiwiAdultRenderer;
import net.mcreator.cosmod.client.renderer.KingPinewoodMushlingRenderer;
import net.mcreator.cosmod.client.renderer.InkyMushlingRenderer;
import net.mcreator.cosmod.client.renderer.GrenadeRenderer;
import net.mcreator.cosmod.client.renderer.GlockRenderer;
import net.mcreator.cosmod.client.renderer.BrownMushlingRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CosmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CosmodModEntities.GRENADE.get(), GrenadeRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.KIWI_ADULT.get(), KiwiAdultRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.KIWI_CHILD.get(), KiwiChildRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.GLOCK.get(), GlockRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.BROWN_MUSHLING.get(), BrownMushlingRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.RED_MUSHLING.get(), RedMushlingRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.INKY_MUSHLING.get(), InkyMushlingRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.RADISH_SPIRIT.get(), RadishSpiritRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.SPEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.MOREL_MUSHLING.get(), MorelMushlingRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.RED_WAXGILL.get(), RedWaxgillRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.LEEK_SPRITE.get(), LeekSpriteRenderer::new);
		event.registerEntityRenderer(CosmodModEntities.KING_PINEWOOD_MUSHLING.get(), KingPinewoodMushlingRenderer::new);
	}
}
