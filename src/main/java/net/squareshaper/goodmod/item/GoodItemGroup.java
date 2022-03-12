package net.squareshaper.goodmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.squareshaper.goodmod.GoodMod;
import net.squareshaper.goodmod.block.GoodBlocks;

public class GoodItemGroup {
    public static final ItemGroup SQUARE = FabricItemGroupBuilder.build(new Identifier(GoodMod.MOD_ID,"square"),
            () -> new ItemStack(GoodBlocks.COMPACT_DOUBLE_COBBLESTONE));
}
