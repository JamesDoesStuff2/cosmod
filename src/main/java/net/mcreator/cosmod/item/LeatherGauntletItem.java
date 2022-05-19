
package net.mcreator.cosmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.cosmod.procedures.KnockbackProcedure;
import net.mcreator.cosmod.init.CosmodModTabs;

public class LeatherGauntletItem extends SwordItem {
	public LeatherGauntletItem() {
		super(new Tier() {
			public int getUses() {
				return 184;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -0.8000000000000003f, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		KnockbackProcedure.execute(entity);
		return retval;
	}
}
