package officialy.astro.letsride.config;

import astro.lib.cfg.AstroConfig;
import net.minecraftforge.common.config.Configuration;
import officialy.astro.letsride.LetsRide;

public class LetsRideConfig extends AstroConfig {

    public static boolean TEST_VALUE;

    public LetsRideConfig() {
        super(LetsRide.NAME, LetsRide.MODID, DEFUALT_CONFIG_FOLDER_PREFIX + LetsRide.MODID, LetsRide.VERSION);
    }

    @Override
    protected void getSettings(Configuration configuration) {
        TEST_VALUE = configuration.getBoolean("test", "general", true, "test value");
    }
}