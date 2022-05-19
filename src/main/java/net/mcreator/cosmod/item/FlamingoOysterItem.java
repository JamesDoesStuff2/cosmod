
package net.mcreator.cosmod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cosmod.init.CosmodModTabs;

public class FlamingoOysterItem extends Item {
	public FlamingoOysterItem() {
		super(new Item.Properties().tab(CosmodModTabs.TAB_COSMOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
