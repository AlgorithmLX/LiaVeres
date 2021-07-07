package com.algorithmlx.liaveres.utils;

import com.algorithmlx.liaveres.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeBlock;
import net.minecraftforge.fml.RegistryObject;

public class ModItemGroups {
    public static ItemGroup createGroup(String id, RegistryObject<Item> icon)
    {
        return new ItemGroup(id) {
            @Override
            public ItemStack createIcon() {
                return new ItemStack(icon.get());
            }
        };
    }

    public static ItemGroup MOD_ITEM_TAB = createGroup("mod_item_tab", ModItems.MATTER_CRYSTAL);
    public static  ItemGroup MOD_BLOCK_TAB = createGroup("mod_block_tab", ModItems.MATTER_CRYSTAL);
}
