
package net.zang.mystcore.item;

import net.zang.mystcore.itemgroup.MysricalHardcoreItemsItemGroup;
import net.zang.mystcore.MhcoreModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@MhcoreModElements.ModElement.Tag
public class MCOREMateriasPICKAREItem extends MhcoreModElements.ModElement {
	@ObjectHolder("mhcore:mcore_materias_pickare")
	public static final Item block = null;
	public MCOREMateriasPICKAREItem(MhcoreModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 10000f;
			}

			public float getAttackDamage() {
				return 78f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 4000;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(MysricalHardcoreItemsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("mcore_materias_pickare"));
	}
}
