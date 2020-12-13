
package net.zang.mystcore.item;

import net.zang.mystcore.itemgroup.MysricalHardcoreItemsItemGroup;
import net.zang.mystcore.MhcoreModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@MhcoreModElements.ModElement.Tag
public class McoreMATERIASWORDItem extends MhcoreModElements.ModElement {
	@ObjectHolder("mhcore:mcore_materiasword")
	public static final Item block = null;
	public McoreMATERIASWORDItem(MhcoreModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 398f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 130;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 96f, new Item.Properties().group(MysricalHardcoreItemsItemGroup.tab)) {
		}.setRegistryName("mcore_materiasword"));
	}
}
