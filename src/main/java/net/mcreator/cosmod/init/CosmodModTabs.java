
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CosmodModTabs {
	public static CreativeModeTab TAB_COSMOD;
	public static CreativeModeTab TAB_PLANTS;

	public static void load() {
		TAB_COSMOD = new CreativeModeTab("tabcosmod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CosmodModBlocks.STACKOFOLDBOOKS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_PLANTS = new CreativeModeTab("tabplants") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CosmodModBlocks.LAVENDER_BUSH_SHORT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
