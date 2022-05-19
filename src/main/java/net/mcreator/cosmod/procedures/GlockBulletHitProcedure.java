package net.mcreator.cosmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class GlockBulletHitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.INSTANT_EFFECT, x, y, z, 5, 0.1, 0.1, 0.1, 1);
	}
}
