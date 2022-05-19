
package net.mcreator.cosmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.cosmod.init.CosmodModTabs;

public class IronGauntletItem extends SwordItem {
	public IronGauntletItem() {
		super(new Tier() {
			public int getUses() {
				return 342;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
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
		}, 3, -0.8f, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD));
	}
}
