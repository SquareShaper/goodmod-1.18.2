package net.squareshaper.goodmod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.squareshaper.goodmod.block.GoodBlocks;

import static java.lang.Math.min;


public class CompactorItem extends Item {
	public CompactorItem(Settings settings) {
		super(settings);
	}
    private Item[] compactables = {
            Items.COBBLESTONE,
            GoodBlocks.COMPACT_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_DOUBLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_TRIPLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_QUADRUPLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_QUINTUPLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_SEXTUPLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_SEPTUPLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_OCTUPLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_NONUPLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_DECUPLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_UNDECUPLE_COBBLESTONE.asItem(),
            GoodBlocks.COMPACT_DODECUPLE_COBBLESTONE.asItem()
    };
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		for (int i = 0; i < compactables.length-1; i++) {
			if (canCompact(user.getInventory(),compactables,i)) {
				int slot = user.getInventory().getSlotWithStack(compactables[i].getDefaultStack());
				int amount = min(user.getInventory().count(compactables[i]) - user.getInventory().count(compactables[i]) % 9, 63);
				if (user.getInventory().getStack(slot).getCount() >= amount)
				{// Check for whether this is the only stack, or compound stacks to subtract more(63 in inv, but first stack is just 1, then it stops at the 1 large stack)
					user.getInventory().removeStack(slot, amount);
					if (user.getInventory().count(compactables[i+1]) == 0) {user.getInventory().insertStack(user.getInventory().getEmptySlot(), new ItemStack(compactables[i+1],amount/9));}
					else {user.getInventory().insertStack(user.getInventory().getSlotWithStack(compactables[i+1].getDefaultStack()), new ItemStack(compactables[i+1],amount/9));}
					user.getInventory().markDirty();
					user.sendMessage(new TranslatableText("lol" + user.age + " " + slot + " " + amount), false);
				}
			}
		}
        return super.use(world,user,hand);
    }
	private boolean canCompact(Inventory inv,Item[] allowedItems, int index)
	{
		boolean result = false;
			if(inv.count(allowedItems[index]) >= 9) {
				result = true;
		}
		return result;
	}
}
