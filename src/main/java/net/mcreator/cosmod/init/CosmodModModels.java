
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cosmod.client.model.Modelsteve;
import net.mcreator.cosmod.client.model.Modelredmushling;
import net.mcreator.cosmod.client.model.Modelred_waxgill;
import net.mcreator.cosmod.client.model.Modelradishspirit;
import net.mcreator.cosmod.client.model.Modelorb;
import net.mcreator.cosmod.client.model.Modelmorel;
import net.mcreator.cosmod.client.model.Modelmoon_staff;
import net.mcreator.cosmod.client.model.Modelleek_sprite;
import net.mcreator.cosmod.client.model.Modelkiwichild;
import net.mcreator.cosmod.client.model.Modelkiwiadult;
import net.mcreator.cosmod.client.model.Modelking_pinewood_mushling;
import net.mcreator.cosmod.client.model.Modelinkymushling;
import net.mcreator.cosmod.client.model.Modelbrownmushling;
import net.mcreator.cosmod.client.model.ModelM33;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CosmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelradishspirit.LAYER_LOCATION, Modelradishspirit::createBodyLayer);
		event.registerLayerDefinition(Modelsteve.LAYER_LOCATION, Modelsteve::createBodyLayer);
		event.registerLayerDefinition(Modelbrownmushling.LAYER_LOCATION, Modelbrownmushling::createBodyLayer);
		event.registerLayerDefinition(ModelM33.LAYER_LOCATION, ModelM33::createBodyLayer);
		event.registerLayerDefinition(Modelmoon_staff.LAYER_LOCATION, Modelmoon_staff::createBodyLayer);
		event.registerLayerDefinition(Modelredmushling.LAYER_LOCATION, Modelredmushling::createBodyLayer);
		event.registerLayerDefinition(Modelred_waxgill.LAYER_LOCATION, Modelred_waxgill::createBodyLayer);
		event.registerLayerDefinition(Modelleek_sprite.LAYER_LOCATION, Modelleek_sprite::createBodyLayer);
		event.registerLayerDefinition(Modelking_pinewood_mushling.LAYER_LOCATION, Modelking_pinewood_mushling::createBodyLayer);
		event.registerLayerDefinition(Modelkiwiadult.LAYER_LOCATION, Modelkiwiadult::createBodyLayer);
		event.registerLayerDefinition(Modelinkymushling.LAYER_LOCATION, Modelinkymushling::createBodyLayer);
		event.registerLayerDefinition(Modelkiwichild.LAYER_LOCATION, Modelkiwichild::createBodyLayer);
		event.registerLayerDefinition(Modelmorel.LAYER_LOCATION, Modelmorel::createBodyLayer);
		event.registerLayerDefinition(Modelorb.LAYER_LOCATION, Modelorb::createBodyLayer);
	}
}
