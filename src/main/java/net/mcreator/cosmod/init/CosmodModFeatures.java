
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.cosmod.world.features.plants.YellowHollyhockFeature;
import net.mcreator.cosmod.world.features.plants.WhitePurplePansiesFeature;
import net.mcreator.cosmod.world.features.plants.SunsetIrisFeature;
import net.mcreator.cosmod.world.features.plants.RuneFernFeature;
import net.mcreator.cosmod.world.features.plants.RedPoppyBushFeature;
import net.mcreator.cosmod.world.features.plants.RedPansiesFeature;
import net.mcreator.cosmod.world.features.plants.RedAnemoneFeature;
import net.mcreator.cosmod.world.features.plants.PurplehollyhockFeature;
import net.mcreator.cosmod.world.features.plants.PurpleblackhollyhockFeature;
import net.mcreator.cosmod.world.features.plants.PinkHollyhockFeature;
import net.mcreator.cosmod.world.features.plants.OrangePurplePansiesFeature;
import net.mcreator.cosmod.world.features.plants.OrangePansiesFeature;
import net.mcreator.cosmod.world.features.plants.NativeBlueLupineFeature;
import net.mcreator.cosmod.world.features.plants.MagentaPansiesFeature;
import net.mcreator.cosmod.world.features.plants.LavenderBushShortFeature;
import net.mcreator.cosmod.world.features.plants.LavenderBushFeature;
import net.mcreator.cosmod.world.features.plants.HotPinkHollyhockFeature;
import net.mcreator.cosmod.world.features.plants.GoldenPinkPansiesFeature;
import net.mcreator.cosmod.world.features.plants.DesertMallowFeature;
import net.mcreator.cosmod.world.features.plants.CallalilyFeature;
import net.mcreator.cosmod.world.features.plants.ButtercupFlowersFeature;
import net.mcreator.cosmod.world.features.plants.BluePansiesFeature;
import net.mcreator.cosmod.world.features.plants.BlueIrisFeature;
import net.mcreator.cosmod.CosmodMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CosmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CosmodMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> CALLALILY = register("callalily", CallalilyFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CallalilyFeature.GENERATE_BIOMES, CallalilyFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAVENDER_BUSH = register("lavender_bush", LavenderBushFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, LavenderBushFeature.GENERATE_BIOMES, LavenderBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NATIVE_BLUE_LUPINE = register("native_blue_lupine", NativeBlueLupineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, NativeBlueLupineFeature.GENERATE_BIOMES,
					NativeBlueLupineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAVENDER_BUSH_SHORT = register("lavender_bush_short", LavenderBushShortFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, LavenderBushShortFeature.GENERATE_BIOMES,
					LavenderBushShortFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BUTTERCUP_FLOWERS = register("buttercup_flowers", ButtercupFlowersFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ButtercupFlowersFeature.GENERATE_BIOMES,
					ButtercupFlowersFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_POPPY_BUSH = register("red_poppy_bush", RedPoppyBushFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RedPoppyBushFeature.GENERATE_BIOMES, RedPoppyBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DESERT_MALLOW = register("desert_mallow", DesertMallowFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, DesertMallowFeature.GENERATE_BIOMES, DesertMallowFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_IRIS = register("blue_iris", BlueIrisFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BlueIrisFeature.GENERATE_BIOMES, BlueIrisFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_PANSIES = register("blue_pansies", BluePansiesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, BluePansiesFeature.GENERATE_BIOMES, BluePansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GOLDEN_PINK_PANSIES = register("golden_pink_pansies", GoldenPinkPansiesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, GoldenPinkPansiesFeature.GENERATE_BIOMES,
					GoldenPinkPansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAGENTA_PANSIES = register("magenta_pansies", MagentaPansiesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MagentaPansiesFeature.GENERATE_BIOMES,
					MagentaPansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ORANGE_PANSIES = register("orange_pansies", OrangePansiesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, OrangePansiesFeature.GENERATE_BIOMES, OrangePansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ORANGE_PURPLE_PANSIES = register("orange_purple_pansies", OrangePurplePansiesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, OrangePurplePansiesFeature.GENERATE_BIOMES,
					OrangePurplePansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_PANSIES = register("red_pansies", RedPansiesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RedPansiesFeature.GENERATE_BIOMES, RedPansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SUNSET_IRIS = register("sunset_iris", SunsetIrisFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, SunsetIrisFeature.GENERATE_BIOMES, SunsetIrisFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WHITE_PURPLE_PANSIES = register("white_purple_pansies", WhitePurplePansiesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WhitePurplePansiesFeature.GENERATE_BIOMES,
					WhitePurplePansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUNE_FERN = register("rune_fern", RuneFernFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RuneFernFeature.GENERATE_BIOMES, RuneFernFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_ANEMONE = register("red_anemone", RedAnemoneFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RedAnemoneFeature.GENERATE_BIOMES, RedAnemoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_HOLLYHOCK = register("yellow_hollyhock", YellowHollyhockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, YellowHollyhockFeature.GENERATE_BIOMES,
					YellowHollyhockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HOT_PINK_HOLLYHOCK = register("hot_pink_hollyhock", HotPinkHollyhockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, HotPinkHollyhockFeature.GENERATE_BIOMES,
					HotPinkHollyhockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PINK_HOLLYHOCK = register("pink_hollyhock", PinkHollyhockFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PinkHollyhockFeature.GENERATE_BIOMES, PinkHollyhockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLEBLACKHOLLYHOCK = register("purpleblackhollyhock", PurpleblackhollyhockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurpleblackhollyhockFeature.GENERATE_BIOMES,
					PurpleblackhollyhockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLEHOLLYHOCK = register("purplehollyhock", PurplehollyhockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurplehollyhockFeature.GENERATE_BIOMES,
					PurplehollyhockFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
