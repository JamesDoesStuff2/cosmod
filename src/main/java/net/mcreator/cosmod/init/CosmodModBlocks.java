
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.cosmod.block.YellowHollyhockBlock;
import net.mcreator.cosmod.block.WhitePurplePansiesBlock;
import net.mcreator.cosmod.block.ThiccCakeBlock;
import net.mcreator.cosmod.block.SunsetIrisBlock;
import net.mcreator.cosmod.block.StrawberryCremetartBlock;
import net.mcreator.cosmod.block.StackofoldbooksBlock;
import net.mcreator.cosmod.block.StackOfLogsBlock;
import net.mcreator.cosmod.block.RunicGrassBlockBlock;
import net.mcreator.cosmod.block.RunicDirtBlockBlock;
import net.mcreator.cosmod.block.RunestoneBlock;
import net.mcreator.cosmod.block.RuneFernBlock;
import net.mcreator.cosmod.block.RedPoppyBushBlock;
import net.mcreator.cosmod.block.RedPansiesBlock;
import net.mcreator.cosmod.block.RedAnemoneBlock;
import net.mcreator.cosmod.block.PurplehollyhockBlock;
import net.mcreator.cosmod.block.PurpleblackhollyhockBlock;
import net.mcreator.cosmod.block.PurpleMorningGloryVineBlock;
import net.mcreator.cosmod.block.PinkHollyhockBlock;
import net.mcreator.cosmod.block.PinkHeartCakeBlock;
import net.mcreator.cosmod.block.OrangePurplePansiesBlock;
import net.mcreator.cosmod.block.OrangePansiesBlock;
import net.mcreator.cosmod.block.NativeBlueLupineBlock;
import net.mcreator.cosmod.block.MushroomGrowLogBlock;
import net.mcreator.cosmod.block.MelonbreadBlock;
import net.mcreator.cosmod.block.MagentaPansiesBlock;
import net.mcreator.cosmod.block.LavenderBushShortBlock;
import net.mcreator.cosmod.block.LavenderBushBlock;
import net.mcreator.cosmod.block.JubileeRoseBushBlock;
import net.mcreator.cosmod.block.HotPinkHollyhockBlock;
import net.mcreator.cosmod.block.GoldenPinkPansiesBlock;
import net.mcreator.cosmod.block.FlamingoOysterGrowLog3Block;
import net.mcreator.cosmod.block.FlamingoOysterGrowLog2Block;
import net.mcreator.cosmod.block.FlamingoOysterGrowLog1Block;
import net.mcreator.cosmod.block.DesertMallowBlock;
import net.mcreator.cosmod.block.CosmeticTableBlock;
import net.mcreator.cosmod.block.CorruptedRunestoneBlock;
import net.mcreator.cosmod.block.CheryBlossomFenceBlock;
import net.mcreator.cosmod.block.CherryBlossomStairsBlock;
import net.mcreator.cosmod.block.CherryBlossomSlabBlock;
import net.mcreator.cosmod.block.CherryBlossomPlanksBlock;
import net.mcreator.cosmod.block.CherryBlossomLeavesBlock;
import net.mcreator.cosmod.block.CallalilyBlock;
import net.mcreator.cosmod.block.ButtercupFlowersBlock;
import net.mcreator.cosmod.block.BooksAndBottlesBlock;
import net.mcreator.cosmod.block.BluePansiesBlock;
import net.mcreator.cosmod.block.BlueIrisBlock;
import net.mcreator.cosmod.block.BigLemonTartBlock;
import net.mcreator.cosmod.CosmodMod;

public class CosmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CosmodMod.MODID);
	public static final RegistryObject<Block> STACKOFOLDBOOKS = REGISTRY.register("stackofoldbooks", () -> new StackofoldbooksBlock());
	public static final RegistryObject<Block> STACK_OF_LOGS = REGISTRY.register("stack_of_logs", () -> new StackOfLogsBlock());
	public static final RegistryObject<Block> THICC_CAKE = REGISTRY.register("thicc_cake", () -> new ThiccCakeBlock());
	public static final RegistryObject<Block> MUSHROOM_GROW_LOG = REGISTRY.register("mushroom_grow_log", () -> new MushroomGrowLogBlock());
	public static final RegistryObject<Block> FLAMINGO_OYSTER_GROW_LOG_1 = REGISTRY.register("flamingo_oyster_grow_log_1",
			() -> new FlamingoOysterGrowLog1Block());
	public static final RegistryObject<Block> FLAMINGO_OYSTER_GROW_LOG_2 = REGISTRY.register("flamingo_oyster_grow_log_2",
			() -> new FlamingoOysterGrowLog2Block());
	public static final RegistryObject<Block> FLAMINGO_OYSTER_GROW_LOG_3 = REGISTRY.register("flamingo_oyster_grow_log_3",
			() -> new FlamingoOysterGrowLog3Block());
	public static final RegistryObject<Block> BOOKS_AND_BOTTLES = REGISTRY.register("books_and_bottles", () -> new BooksAndBottlesBlock());
	public static final RegistryObject<Block> CALLALILY = REGISTRY.register("callalily", () -> new CallalilyBlock());
	public static final RegistryObject<Block> LAVENDER_BUSH = REGISTRY.register("lavender_bush", () -> new LavenderBushBlock());
	public static final RegistryObject<Block> NATIVE_BLUE_LUPINE = REGISTRY.register("native_blue_lupine", () -> new NativeBlueLupineBlock());
	public static final RegistryObject<Block> LAVENDER_BUSH_SHORT = REGISTRY.register("lavender_bush_short", () -> new LavenderBushShortBlock());
	public static final RegistryObject<Block> CHERRY_BLOSSOM_LEAVES = REGISTRY.register("cherry_blossom_leaves",
			() -> new CherryBlossomLeavesBlock());
	public static final RegistryObject<Block> BUTTERCUP_FLOWERS = REGISTRY.register("buttercup_flowers", () -> new ButtercupFlowersBlock());
	public static final RegistryObject<Block> RED_POPPY_BUSH = REGISTRY.register("red_poppy_bush", () -> new RedPoppyBushBlock());
	public static final RegistryObject<Block> JUBILEE_ROSE_BUSH = REGISTRY.register("jubilee_rose_bush", () -> new JubileeRoseBushBlock());
	public static final RegistryObject<Block> DESERT_MALLOW = REGISTRY.register("desert_mallow", () -> new DesertMallowBlock());
	public static final RegistryObject<Block> BLUE_IRIS = REGISTRY.register("blue_iris", () -> new BlueIrisBlock());
	public static final RegistryObject<Block> BLUE_PANSIES = REGISTRY.register("blue_pansies", () -> new BluePansiesBlock());
	public static final RegistryObject<Block> GOLDEN_PINK_PANSIES = REGISTRY.register("golden_pink_pansies", () -> new GoldenPinkPansiesBlock());
	public static final RegistryObject<Block> MAGENTA_PANSIES = REGISTRY.register("magenta_pansies", () -> new MagentaPansiesBlock());
	public static final RegistryObject<Block> ORANGE_PANSIES = REGISTRY.register("orange_pansies", () -> new OrangePansiesBlock());
	public static final RegistryObject<Block> ORANGE_PURPLE_PANSIES = REGISTRY.register("orange_purple_pansies",
			() -> new OrangePurplePansiesBlock());
	public static final RegistryObject<Block> RED_PANSIES = REGISTRY.register("red_pansies", () -> new RedPansiesBlock());
	public static final RegistryObject<Block> SUNSET_IRIS = REGISTRY.register("sunset_iris", () -> new SunsetIrisBlock());
	public static final RegistryObject<Block> WHITE_PURPLE_PANSIES = REGISTRY.register("white_purple_pansies", () -> new WhitePurplePansiesBlock());
	public static final RegistryObject<Block> RUNE_FERN = REGISTRY.register("rune_fern", () -> new RuneFernBlock());
	public static final RegistryObject<Block> CHERRY_BLOSSOM_PLANKS = REGISTRY.register("cherry_blossom_planks",
			() -> new CherryBlossomPlanksBlock());
	public static final RegistryObject<Block> CHERRY_BLOSSOM_STAIRS = REGISTRY.register("cherry_blossom_stairs",
			() -> new CherryBlossomStairsBlock());
	public static final RegistryObject<Block> CHERRY_BLOSSOM_SLAB = REGISTRY.register("cherry_blossom_slab", () -> new CherryBlossomSlabBlock());
	public static final RegistryObject<Block> CHERY_BLOSSOM_FENCE = REGISTRY.register("chery_blossom_fence", () -> new CheryBlossomFenceBlock());
	public static final RegistryObject<Block> PURPLE_MORNING_GLORY_VINE = REGISTRY.register("purple_morning_glory_vine",
			() -> new PurpleMorningGloryVineBlock());
	public static final RegistryObject<Block> RUNESTONE = REGISTRY.register("runestone", () -> new RunestoneBlock());
	public static final RegistryObject<Block> CORRUPTED_RUNESTONE = REGISTRY.register("corrupted_runestone", () -> new CorruptedRunestoneBlock());
	public static final RegistryObject<Block> RUNIC_GRASS_BLOCK = REGISTRY.register("runic_grass_block", () -> new RunicGrassBlockBlock());
	public static final RegistryObject<Block> RUNIC_DIRT_BLOCK = REGISTRY.register("runic_dirt_block", () -> new RunicDirtBlockBlock());
	public static final RegistryObject<Block> COSMETIC_TABLE = REGISTRY.register("cosmetic_table", () -> new CosmeticTableBlock());
	public static final RegistryObject<Block> MELONBREAD = REGISTRY.register("melonbread", () -> new MelonbreadBlock());
	public static final RegistryObject<Block> RED_ANEMONE = REGISTRY.register("red_anemone", () -> new RedAnemoneBlock());
	public static final RegistryObject<Block> YELLOW_HOLLYHOCK = REGISTRY.register("yellow_hollyhock", () -> new YellowHollyhockBlock());
	public static final RegistryObject<Block> HOT_PINK_HOLLYHOCK = REGISTRY.register("hot_pink_hollyhock", () -> new HotPinkHollyhockBlock());
	public static final RegistryObject<Block> PINK_HOLLYHOCK = REGISTRY.register("pink_hollyhock", () -> new PinkHollyhockBlock());
	public static final RegistryObject<Block> PURPLEBLACKHOLLYHOCK = REGISTRY.register("purpleblackhollyhock", () -> new PurpleblackhollyhockBlock());
	public static final RegistryObject<Block> PURPLEHOLLYHOCK = REGISTRY.register("purplehollyhock", () -> new PurplehollyhockBlock());
	public static final RegistryObject<Block> STRAWBERRY_CREMETART = REGISTRY.register("strawberry_cremetart", () -> new StrawberryCremetartBlock());
	public static final RegistryObject<Block> PINK_HEART_CAKE = REGISTRY.register("pink_heart_cake", () -> new PinkHeartCakeBlock());
	public static final RegistryObject<Block> BIG_LEMON_TART = REGISTRY.register("big_lemon_tart", () -> new BigLemonTartBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			StackofoldbooksBlock.registerRenderLayer();
			StackOfLogsBlock.registerRenderLayer();
			ThiccCakeBlock.registerRenderLayer();
			MushroomGrowLogBlock.registerRenderLayer();
			FlamingoOysterGrowLog1Block.registerRenderLayer();
			FlamingoOysterGrowLog2Block.registerRenderLayer();
			FlamingoOysterGrowLog3Block.registerRenderLayer();
			BooksAndBottlesBlock.registerRenderLayer();
			CallalilyBlock.registerRenderLayer();
			LavenderBushBlock.registerRenderLayer();
			NativeBlueLupineBlock.registerRenderLayer();
			LavenderBushShortBlock.registerRenderLayer();
			CherryBlossomLeavesBlock.registerRenderLayer();
			ButtercupFlowersBlock.registerRenderLayer();
			RedPoppyBushBlock.registerRenderLayer();
			DesertMallowBlock.registerRenderLayer();
			BlueIrisBlock.registerRenderLayer();
			BluePansiesBlock.registerRenderLayer();
			GoldenPinkPansiesBlock.registerRenderLayer();
			MagentaPansiesBlock.registerRenderLayer();
			OrangePansiesBlock.registerRenderLayer();
			OrangePurplePansiesBlock.registerRenderLayer();
			RedPansiesBlock.registerRenderLayer();
			SunsetIrisBlock.registerRenderLayer();
			WhitePurplePansiesBlock.registerRenderLayer();
			RuneFernBlock.registerRenderLayer();
			PurpleMorningGloryVineBlock.registerRenderLayer();
			CosmeticTableBlock.registerRenderLayer();
			MelonbreadBlock.registerRenderLayer();
			RedAnemoneBlock.registerRenderLayer();
			YellowHollyhockBlock.registerRenderLayer();
			HotPinkHollyhockBlock.registerRenderLayer();
			PinkHollyhockBlock.registerRenderLayer();
			PurpleblackhollyhockBlock.registerRenderLayer();
			PurplehollyhockBlock.registerRenderLayer();
			StrawberryCremetartBlock.registerRenderLayer();
			PinkHeartCakeBlock.registerRenderLayer();
			BigLemonTartBlock.registerRenderLayer();
		}
	}
}
