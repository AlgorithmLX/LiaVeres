package com.algorithmlx.liaveres.common.object.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.server.ServerLifecycleHooks;


public class MatterCrystal extends Item {

    public MatterCrystal() {
        super(new Item.Properties());
        setRegistryName("matter_crystal");
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        Hand hand = context.getHand();
        ItemStack itemstack = player.getHeldItem(hand);
        return null;
    }
}
