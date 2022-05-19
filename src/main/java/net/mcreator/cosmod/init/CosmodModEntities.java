
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.cosmod.entity.SpearEntity;
import net.mcreator.cosmod.entity.RedWaxgillEntity;
import net.mcreator.cosmod.entity.RedMushlingEntity;
import net.mcreator.cosmod.entity.RadishSpiritEntity;
import net.mcreator.cosmod.entity.MorelMushlingEntity;
import net.mcreator.cosmod.entity.LeekSpriteEntity;
import net.mcreator.cosmod.entity.KiwiChildEntity;
import net.mcreator.cosmod.entity.KiwiAdultEntity;
import net.mcreator.cosmod.entity.KingPinewoodMushlingEntity;
import net.mcreator.cosmod.entity.InkyMushlingEntity;
import net.mcreator.cosmod.entity.GrenadeEntity;
import net.mcreator.cosmod.entity.GlockEntity;
import net.mcreator.cosmod.entity.BrownMushlingEntity;
import net.mcreator.cosmod.CosmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CosmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, CosmodMod.MODID);
	public static final RegistryObject<EntityType<GrenadeEntity>> GRENADE = register("projectile_grenade",
			EntityType.Builder.<GrenadeEntity>of(GrenadeEntity::new, MobCategory.MISC).setCustomClientFactory(GrenadeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KiwiAdultEntity>> KIWI_ADULT = register("kiwi_adult",
			EntityType.Builder.<KiwiAdultEntity>of(KiwiAdultEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KiwiAdultEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<KiwiChildEntity>> KIWI_CHILD = register("kiwi_child",
			EntityType.Builder.<KiwiChildEntity>of(KiwiChildEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KiwiChildEntity::new)

					.sized(0.3f, 0.6f));
	public static final RegistryObject<EntityType<GlockEntity>> GLOCK = register("projectile_glock",
			EntityType.Builder.<GlockEntity>of(GlockEntity::new, MobCategory.MISC).setCustomClientFactory(GlockEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BrownMushlingEntity>> BROWN_MUSHLING = register("brown_mushling",
			EntityType.Builder.<BrownMushlingEntity>of(BrownMushlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BrownMushlingEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<RedMushlingEntity>> RED_MUSHLING = register("red_mushling",
			EntityType.Builder.<RedMushlingEntity>of(RedMushlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedMushlingEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<InkyMushlingEntity>> INKY_MUSHLING = register("inky_mushling",
			EntityType.Builder.<InkyMushlingEntity>of(InkyMushlingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InkyMushlingEntity::new)

					.sized(0.5f, 0.9f));
	public static final RegistryObject<EntityType<RadishSpiritEntity>> RADISH_SPIRIT = register("radish_spirit",
			EntityType.Builder.<RadishSpiritEntity>of(RadishSpiritEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RadishSpiritEntity::new)

					.sized(0.9f, 1.9000000000000001f));
	public static final RegistryObject<EntityType<SpearEntity>> SPEAR = register("projectile_spear",
			EntityType.Builder.<SpearEntity>of(SpearEntity::new, MobCategory.MISC).setCustomClientFactory(SpearEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MorelMushlingEntity>> MOREL_MUSHLING = register("morel_mushling",
			EntityType.Builder.<MorelMushlingEntity>of(MorelMushlingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MorelMushlingEntity::new)

					.sized(0.6f, 0.9f));
	public static final RegistryObject<EntityType<RedWaxgillEntity>> RED_WAXGILL = register("red_waxgill",
			EntityType.Builder.<RedWaxgillEntity>of(RedWaxgillEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedWaxgillEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LeekSpriteEntity>> LEEK_SPRITE = register("leek_sprite",
			EntityType.Builder.<LeekSpriteEntity>of(LeekSpriteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LeekSpriteEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KingPinewoodMushlingEntity>> KING_PINEWOOD_MUSHLING = register("king_pinewood_mushling",
			EntityType.Builder.<KingPinewoodMushlingEntity>of(KingPinewoodMushlingEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(KingPinewoodMushlingEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			KiwiAdultEntity.init();
			KiwiChildEntity.init();
			BrownMushlingEntity.init();
			RedMushlingEntity.init();
			InkyMushlingEntity.init();
			RadishSpiritEntity.init();
			MorelMushlingEntity.init();
			RedWaxgillEntity.init();
			LeekSpriteEntity.init();
			KingPinewoodMushlingEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KIWI_ADULT.get(), KiwiAdultEntity.createAttributes().build());
		event.put(KIWI_CHILD.get(), KiwiChildEntity.createAttributes().build());
		event.put(BROWN_MUSHLING.get(), BrownMushlingEntity.createAttributes().build());
		event.put(RED_MUSHLING.get(), RedMushlingEntity.createAttributes().build());
		event.put(INKY_MUSHLING.get(), InkyMushlingEntity.createAttributes().build());
		event.put(RADISH_SPIRIT.get(), RadishSpiritEntity.createAttributes().build());
		event.put(MOREL_MUSHLING.get(), MorelMushlingEntity.createAttributes().build());
		event.put(RED_WAXGILL.get(), RedWaxgillEntity.createAttributes().build());
		event.put(LEEK_SPRITE.get(), LeekSpriteEntity.createAttributes().build());
		event.put(KING_PINEWOOD_MUSHLING.get(), KingPinewoodMushlingEntity.createAttributes().build());
	}
}
