package net.squareshaper.goodmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.squareshaper.goodmod.GoodMod;
import org.checkerframework.checker.units.qual.A;

public class GoodItems {
    public static final Item STONE_ROD = registerItem("stone_rod",new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GoodMod.MOD_ID, name), item);
    }

    public static void registerGoodItems() {
        GoodMod.LOGGER.info("Registering Good Items for " + GoodMod.MOD_ID);
    }
}
