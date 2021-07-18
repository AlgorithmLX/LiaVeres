package com.algorithmlx.liaveres.common.registry;

import com.algorithmlx.liaveres.common.object.blocks.EnergyStorageBlock;
import com.algorithmlx.liaveres.common.object.blocks.MatterCrystalBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Objects;

import static com.algorithmlx.liaveres.LiaVeres.ModId;

@Mod.EventBusSubscriber(modid = ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    @ObjectHolder(ModId + ":matter_crystal_block")
    public static Block MatterCrystalBlock = null;

    @ObjectHolder(ModId + ":energy_storage_block")
    public static Block EnergyStorageBlock = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> e) {
        registerBlock(e, new MatterCrystalBlock("matter_crystal_block"));
        registerBlock(e, new EnergyStorageBlock("energy_storage_block"));
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> e) {
        registerItem(e, MatterCrystalBlock);
        registerItem(e, EnergyStorageBlock);
    }


    private static void registerBlock(RegistryEvent.Register<Block> event, Block block) {
        event.getRegistry().register(block);
    }

    private static void registerItem(RegistryEvent.Register<Item> event, Block block) {
        event.getRegistry().register(new BlockItem(block, new Item.Properties()
                .group(ItemGroup.MISC)).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
    }
}
