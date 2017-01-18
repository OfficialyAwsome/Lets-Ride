package com.officialy.letsride.config;

import com.mcmoddev.lib.config.MMDConfig;
import net.minecraft.util.ResourceLocation;

import java.io.File;

public class LetsRideConfig extends MMDConfig {

    public static final ResourceLocation IDENTITY = new ResourceLocation("letsride", "config");

    public LetsRideConfig(File file) {
        super(file);
    }

    @Override
    public ResourceLocation getIdentifier() {
        return IDENTITY;
    }
}
