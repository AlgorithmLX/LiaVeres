
package net.zang.mystcore.item;

import net.zang.mystcore.itemgroup.MysticalHardcoreFoodItemGroup;
import net.zang.mystcore.MhcoreModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@MhcoreModElements.ModElement.Tag
public class SoupofmateriaItem extends MhcoreModElements.ModElement {
	@ObjectHolder("mhcore:soupofmateria")
	public static final Item block = null;
	public SoupofmateriaItem(MhcoreModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MysticalHardcoreFoodItemGroup.tab).maxStackSize(4)
					.food((new Food.Builder()).hunger(50).saturation(3.2f).build()));
			setRegistryName("soupofmateria");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 300;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("it`s a ????? Soup"));
		}
	}
}
