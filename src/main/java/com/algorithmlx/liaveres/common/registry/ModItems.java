package com.algorithmlx.liaveres.common.registry;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.algorithmlx.liaveres.common.object.items.MatterCrystal;

import static com.algorithmlx.liaveres.liaveres.ModId;

@Mod.EventBusSubscriber(modid = ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static Item matter_crystal = new MatterCrystal();


    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> e) {
        register(e, matter_crystal);

    }


    private static void register(RegistryEvent.Register<Item> event, Item item) {
        event.getRegistry().register(item);
    }
}
