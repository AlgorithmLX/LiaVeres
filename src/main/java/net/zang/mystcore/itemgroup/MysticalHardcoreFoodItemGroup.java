
package net.zang.mystcore.itemgroup;

import net.zang.mystcore.item.SoupofmateriaItem;
import net.zang.mystcore.MhcoreModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MhcoreModElements.ModElement.Tag
public class MysticalHardcoreFoodItemGroup extends MhcoreModElements.ModElement {
	public MysticalHardcoreFoodItemGroup(MhcoreModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmystical_hardcore_food") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SoupofmateriaItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
