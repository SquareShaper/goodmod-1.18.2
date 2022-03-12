package net.squareshaper.goodmod;

import net.fabricmc.api.ModInitializer;
import net.squareshaper.goodmod.block.GoodBlocks;
import net.squareshaper.goodmod.item.GoodItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodMod implements ModInitializer {
	public static final String MOD_ID = "goodmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GoodItems.registerGoodItems();
		GoodBlocks.registerGoodBlocks();
	}
}
