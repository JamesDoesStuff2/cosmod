package net.mcreator.cosmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class GrenadeProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.NONE);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.NONE);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.NONE);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 100, 0.7, 0.7, 0.7, 0.1);
	}
}
