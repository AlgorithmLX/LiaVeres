
package net.zang.mystcore.item;

import net.zang.mystcore.procedures.VhpouchenmcoresadasdasdProcedure;
import net.zang.mystcore.itemgroup.MysticalHardcoreFoodItemGroup;
import net.zang.mystcore.MhcoreModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

@MhcoreModElements.ModElement.Tag
public class McoreVIllagerHeardItem extends MhcoreModElements.ModElement {
	@ObjectHolder("mhcore:mcore_v_illager_heard")
	public static final Item block = null;
	public McoreVIllagerHeardItem(MhcoreModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MysticalHardcoreFoodItemGroup.tab).maxStackSize(1)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).setAlwaysEdible().meat().build()));
			setRegistryName("mcore_v_illager_heard");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				VhpouchenmcoresadasdasdProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
