package me.asgard.rain.afu;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

/**
 * me.asgard.rain.afu.AFUConn
 * AntiForceUnicode
 *
 * @author 寒雨
 * @since 2021/12/29 15:16
 **/
public class AFUConn implements IMixinConnector {
    @Override
    public void connect() {
        Mixins.addConfiguration("mixins.anti_force_unicode.config.json");
    }
}