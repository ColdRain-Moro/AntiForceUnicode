package me.asgard.rain.afu.mixin;

import com.google.common.collect.ImmutableMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.fonts.FontResourceManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.io.IOException;

/**
 * me.asgard.rain.afu.GameSettingMixin
 * AntiForceUnicode
 *
 * @author 寒雨
 * @since 2021/12/29 13:48
 **/
@Mixin(Minecraft.class)
public abstract class MinecraftMixin {

    @Final
    @Shadow
    private FontResourceManager fontManager;

    /**
     * @author Rain
     * @reason force disable force unicode
     */
    @Overwrite
    public boolean isEnforceUnicode() {
        return false;
    }

    /**
     * @author Rain
     * @reason force disable force unicode
     */
    @Overwrite
    public void selectMainFont(boolean p_238209_1_) {
        fontManager.setRenames(ImmutableMap.of());
    }
}
