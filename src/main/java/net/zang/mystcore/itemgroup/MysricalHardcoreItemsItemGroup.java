
package net.zang.mystcore.itemgroup;

import net.zang.mystcore.item.McoremateriaItem;
import net.zang.mystcore.MhcoreModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MhcoreModElements.ModElement.Tag
public class MysricalHardcoreItemsItemGroup extends MhcoreModElements.ModElement {
	public MysricalHardcoreItemsItemGroup(MhcoreModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmysrical_hardcore_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(McoremateriaItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
