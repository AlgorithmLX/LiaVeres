
package net.zang.mystcore.itemgroup;

import net.zang.mystcore.block.BlockofmateriaBlock;
import net.zang.mystcore.MhcoreModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MhcoreModElements.ModElement.Tag
public class MysticalHardcoreBlockItemGroup extends MhcoreModElements.ModElement {
	public MysticalHardcoreBlockItemGroup(MhcoreModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmystical_hardcore_block") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlockofmateriaBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
