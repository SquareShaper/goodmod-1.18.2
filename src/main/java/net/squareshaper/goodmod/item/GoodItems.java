package net.squareshaper.goodmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.squareshaper.goodmod.GoodMod;
import net.squareshaper.goodmod.item.custom.CompactorItem;
import org.checkerframework.checker.units.qual.A;

public class GoodItems {
    public static final Item STONE_ROD = registerItem("stone_rod",new Item(new FabricItemSettings().group(GoodItemGroup.SQUARE)));
    public static final Item IRON_ROD = registerItem("iron_rod",new Item(new FabricItemSettings().group(GoodItemGroup.SQUARE)));
    public static final Item GOLD_ROD = registerItem("gold_rod",new Item(new FabricItemSettings().group(GoodItemGroup.SQUARE)));
    public static final Item COMPACTOR = registerItem("compactor",new CompactorItem(new FabricItemSettings().group(GoodItemGroup.SQUARE)));
    // INCOMPLETE ^^

    public static final Item STONE_PIXEL = registerItem("stone_pixel",new Item(new FabricItemSettings().group(GoodItemGroup.SQUARE)));
    public static final Item IRON_PIXEL = registerItem("iron_pixel",new Item(new FabricItemSettings().group(GoodItemGroup.SQUARE)));
    public static final Item GOLD_PIXEL = registerItem("gold_pixel",new Item(new FabricItemSettings().group(GoodItemGroup.SQUARE)));
    public static final Item DIAMOND_PIXEL = registerItem("diamond_pixel",new Item(new FabricItemSettings().group(GoodItemGroup.SQUARE)));
    public static final Item NETHERITE_PIXEL = registerItem("netherite_pixel",new Item(new FabricItemSettings().group(GoodItemGroup.SQUARE)));

    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GoodMod.MOD_ID, name), item);
    }

    public static void registerGoodItems() {
        GoodMod.LOGGER.info("Registering Good Items for " + GoodMod.MOD_ID);
    }
}
