
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cosmod.item.TannedHideItem;
import net.mcreator.cosmod.item.SpearItem;
import net.mcreator.cosmod.item.MoonStaffItem;
import net.mcreator.cosmod.item.LeatherGauntletItem;
import net.mcreator.cosmod.item.IronbattleaxeItem;
import net.mcreator.cosmod.item.IronGauntletItem;
import net.mcreator.cosmod.item.GrenadeItem;
import net.mcreator.cosmod.item.GlockItem;
import net.mcreator.cosmod.item.FlamingoOysterSporesItem;
import net.mcreator.cosmod.item.FlamingoOysterItem;
import net.mcreator.cosmod.item.BrassKnucklesItem;
import net.mcreator.cosmod.item.ArmingBladeItem;
import net.mcreator.cosmod.item.AmethystDaggerItem;
import net.mcreator.cosmod.CosmodMod;

public class CosmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CosmodMod.MODID);
	public static final RegistryObject<Item> STACKOFOLDBOOKS = block(CosmodModBlocks.STACKOFOLDBOOKS, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> STACK_OF_LOGS = block(CosmodModBlocks.STACK_OF_LOGS, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> THICC_CAKE = block(CosmodModBlocks.THICC_CAKE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> MUSHROOM_GROW_LOG = block(CosmodModBlocks.MUSHROOM_GROW_LOG, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> FLAMINGO_OYSTER = REGISTRY.register("flamingo_oyster", () -> new FlamingoOysterItem());
	public static final RegistryObject<Item> FLAMINGO_OYSTER_SPORES = REGISTRY.register("flamingo_oyster_spores",
			() -> new FlamingoOysterSporesItem());
	public static final RegistryObject<Item> FLAMINGO_OYSTER_GROW_LOG_1 = block(CosmodModBlocks.FLAMINGO_OYSTER_GROW_LOG_1, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> FLAMINGO_OYSTER_GROW_LOG_2 = block(CosmodModBlocks.FLAMINGO_OYSTER_GROW_LOG_2, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> FLAMINGO_OYSTER_GROW_LOG_3 = block(CosmodModBlocks.FLAMINGO_OYSTER_GROW_LOG_3, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> BOOKS_AND_BOTTLES = block(CosmodModBlocks.BOOKS_AND_BOTTLES, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> BRASS_KNUCKLES = REGISTRY.register("brass_knuckles", () -> new BrassKnucklesItem());
	public static final RegistryObject<Item> GRENADE = REGISTRY.register("grenade", () -> new GrenadeItem());
	public static final RegistryObject<Item> KIWI_ADULT = REGISTRY.register("kiwi_adult_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.KIWI_ADULT, -6724096, -8370432, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> GLOCK = REGISTRY.register("glock", () -> new GlockItem());
	public static final RegistryObject<Item> CALLALILY = block(CosmodModBlocks.CALLALILY, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> LAVENDER_BUSH = doubleBlock(CosmodModBlocks.LAVENDER_BUSH, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> NATIVE_BLUE_LUPINE = doubleBlock(CosmodModBlocks.NATIVE_BLUE_LUPINE, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> LAVENDER_BUSH_SHORT = block(CosmodModBlocks.LAVENDER_BUSH_SHORT, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> CHERRY_BLOSSOM_LEAVES = block(CosmodModBlocks.CHERRY_BLOSSOM_LEAVES, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> AMETHYST_DAGGER = REGISTRY.register("amethyst_dagger", () -> new AmethystDaggerItem());
	public static final RegistryObject<Item> BROWN_MUSHLING = REGISTRY.register("brown_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.BROWN_MUSHLING, -6737152, -10092544, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> RED_MUSHLING = REGISTRY.register("red_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.RED_MUSHLING, -65485, -3394816, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> INKY_MUSHLING = REGISTRY.register("inky_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.INKY_MUSHLING, -13369549, -6724096, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> IRON_BATTLE_AXE = REGISTRY.register("iron_battle_axe", () -> new IronbattleaxeItem());
	public static final RegistryObject<Item> BUTTERCUP_FLOWERS = block(CosmodModBlocks.BUTTERCUP_FLOWERS, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> ARMING_BLADE = REGISTRY.register("arming_blade", () -> new ArmingBladeItem());
	public static final RegistryObject<Item> RED_POPPY_BUSH = doubleBlock(CosmodModBlocks.RED_POPPY_BUSH, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> JUBILEE_ROSE_BUSH = block(CosmodModBlocks.JUBILEE_ROSE_BUSH, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> DESERT_MALLOW = doubleBlock(CosmodModBlocks.DESERT_MALLOW, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> LEATHER_GAUNTLET = REGISTRY.register("leather_gauntlet", () -> new LeatherGauntletItem());
	public static final RegistryObject<Item> BLUE_IRIS = doubleBlock(CosmodModBlocks.BLUE_IRIS, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> BLUE_PANSIES = block(CosmodModBlocks.BLUE_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> GOLDEN_PINK_PANSIES = block(CosmodModBlocks.GOLDEN_PINK_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> MAGENTA_PANSIES = block(CosmodModBlocks.MAGENTA_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> ORANGE_PANSIES = block(CosmodModBlocks.ORANGE_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> ORANGE_PURPLE_PANSIES = block(CosmodModBlocks.ORANGE_PURPLE_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> RED_PANSIES = block(CosmodModBlocks.RED_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> SUNSET_IRIS = doubleBlock(CosmodModBlocks.SUNSET_IRIS, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> WHITE_PURPLE_PANSIES = block(CosmodModBlocks.WHITE_PURPLE_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> RUNE_FERN = block(CosmodModBlocks.RUNE_FERN, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> CHERRY_BLOSSOM_PLANKS = block(CosmodModBlocks.CHERRY_BLOSSOM_PLANKS, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> CHERRY_BLOSSOM_STAIRS = block(CosmodModBlocks.CHERRY_BLOSSOM_STAIRS, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> CHERRY_BLOSSOM_SLAB = block(CosmodModBlocks.CHERRY_BLOSSOM_SLAB, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> CHERY_BLOSSOM_FENCE = block(CosmodModBlocks.CHERY_BLOSSOM_FENCE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> PURPLE_MORNING_GLORY_VINE = block(CosmodModBlocks.PURPLE_MORNING_GLORY_VINE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> RUNESTONE = block(CosmodModBlocks.RUNESTONE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> CORRUPTED_RUNESTONE = block(CosmodModBlocks.CORRUPTED_RUNESTONE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> RADISH_SPIRIT = REGISTRY.register("radish_spirit_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.RADISH_SPIRIT, -16738048, -16751104, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> IRON_GAUNTLET = REGISTRY.register("iron_gauntlet", () -> new IronGauntletItem());
	public static final RegistryObject<Item> TANNED_HIDE = REGISTRY.register("tanned_hide", () -> new TannedHideItem());
	public static final RegistryObject<Item> SPEAR = REGISTRY.register("spear", () -> new SpearItem());
	public static final RegistryObject<Item> MOON_STAFF = REGISTRY.register("moon_staff", () -> new MoonStaffItem());
	public static final RegistryObject<Item> RUNIC_GRASS_BLOCK = block(CosmodModBlocks.RUNIC_GRASS_BLOCK, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> RUNIC_DIRT_BLOCK = block(CosmodModBlocks.RUNIC_DIRT_BLOCK, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> MOREL_MUSHLING = REGISTRY.register("morel_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.MOREL_MUSHLING, -1, -1, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> RED_WAXGILL = REGISTRY.register("red_waxgill_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.RED_WAXGILL, -1, -1, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> COSMETIC_TABLE = block(CosmodModBlocks.COSMETIC_TABLE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> MELONBREAD = block(CosmodModBlocks.MELONBREAD, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> RED_ANEMONE = block(CosmodModBlocks.RED_ANEMONE, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> YELLOW_HOLLYHOCK = doubleBlock(CosmodModBlocks.YELLOW_HOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> HOT_PINK_HOLLYHOCK = doubleBlock(CosmodModBlocks.HOT_PINK_HOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> PINK_HOLLYHOCK = doubleBlock(CosmodModBlocks.PINK_HOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> PURPLEBLACKHOLLYHOCK = doubleBlock(CosmodModBlocks.PURPLEBLACKHOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> PURPLEHOLLYHOCK = doubleBlock(CosmodModBlocks.PURPLEHOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> STRAWBERRY_CREMETART = block(CosmodModBlocks.STRAWBERRY_CREMETART, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> LEEK_SPRITE = REGISTRY.register("leek_sprite_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.LEEK_SPRITE, -13369600, -16724941, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> PINK_HEART_CAKE = block(CosmodModBlocks.PINK_HEART_CAKE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> KING_PINEWOOD_MUSHLING = REGISTRY.register("king_pinewood_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.KING_PINEWOOD_MUSHLING, -10079488, -6750208,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BIG_LEMON_TART = block(CosmodModBlocks.BIG_LEMON_TART, CosmodModTabs.TAB_COSMOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
