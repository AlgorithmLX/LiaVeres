package com.algorithmlx.liaveres.init;

import com.algorithmlx.liaveres.items.MaterialItem;
import com.algorithmlx.liaveres.liaveres;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, liaveres.MOD_ID);

    public  static  final RegistryObject<Item> MATER_CRYSTAL = ITEMS.register("mater_crystal", MaterialItem::new);
}