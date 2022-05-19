package net.mcreator.cosmod.procedures;

import net.minecraft.world.entity.Entity;

public class IronbattleaxeToolInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSprinting((false));
	}
}
