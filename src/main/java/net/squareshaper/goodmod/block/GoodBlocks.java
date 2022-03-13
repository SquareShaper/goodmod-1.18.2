package net.squareshaper.goodmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.squareshaper.goodmod.GoodMod;
import net.squareshaper.goodmod.item.GoodItemGroup;

public class GoodBlocks {
    public static final Block COMPACT_COBBLESTONE = registerBlock("compact_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_DOUBLE_COBBLESTONE = registerBlock("compact_double_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_TRIPLE_COBBLESTONE = registerBlock("compact_triple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_QUADRUPLE_COBBLESTONE = registerBlock("compact_quadruple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_QUINTUPLE_COBBLESTONE = registerBlock("compact_quintuple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(7f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_SEXTUPLE_COBBLESTONE = registerBlock("compact_sextuple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(8f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_SEPTUPLE_COBBLESTONE = registerBlock("compact_septuple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(9f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_OCTUPLE_COBBLESTONE = registerBlock("compact_octuple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_NONUPLE_COBBLESTONE = registerBlock("compact_nonuple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(11f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_DECUPLE_COBBLESTONE = registerBlock("compact_decuple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(12f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_UNDECUPLE_COBBLESTONE = registerBlock("compact_undecuple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(13f).requiresTool()), GoodItemGroup.SQUARE);
    public static final Block COMPACT_DODECUPLE_COBBLESTONE = registerBlock("compact_dodecuple_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(14f).requiresTool()), GoodItemGroup.SQUARE);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(GoodMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(GoodMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerGoodBlocks(){
        GoodMod.LOGGER.info("Registering Good Blocks for " + GoodMod.MOD_ID);
    }

}
