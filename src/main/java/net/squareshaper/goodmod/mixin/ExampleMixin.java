package net.squareshaper.goodmod.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.squareshaper.goodmod.GoodMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		GoodMod.LOGGER.info("This line is printed by a good mod mixin!");
	}
}
