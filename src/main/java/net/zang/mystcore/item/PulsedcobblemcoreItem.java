
package net.zang.mystcore.item;

import net.zang.mystcore.itemgroup.MysricalHardcoreItemsItemGroup;
import net.zang.mystcore.MhcoreModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@MhcoreModElements.ModElement.Tag
public class PulsedcobblemcoreItem extends MhcoreModElements.ModElement {
	@ObjectHolder("mhcore:pulsedcobblemcore")
	public static final Item block = null;
	public PulsedcobblemcoreItem(MhcoreModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MysricalHardcoreItemsItemGroup.tab).maxStackSize(64));
			setRegistryName("pulsedcobblemcore");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
