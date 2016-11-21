package officialy.astro.letsride;

import astro.lib.AstroTab;
import astro.lib.cfg.AstroConfig;
import astro.lib.cfg.ConfigRegistry;
import astro.lib.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import officialy.astro.letsride.config.LetsRideConfig;


@Mod(modid = LetsRide.MODID,
        name = LetsRide.NAME,
        version = LetsRide.VERSION,
        dependencies = "required-after:astrolib")
public class LetsRide {

    public static final String MODID = "letsride";
    public static final String NAME = "Lets Ride";
    public static final String VERSION = "0.0.1a";

    private AstroConfig CONFIG = new LetsRideConfig();
    public static AstroTab LETSRIDE_TAB_ITEMS;
    public static AstroTab LETSRIDE_TAB_BLOCKS;

    @Instance(MODID)
    public LetsRide INSTANCE;

    @SidedProxy(clientSide = "officialy.astro.letsride.proxy.ClientProxy", serverSide = "officialy.astro.letsride.proxy.ServerProxy")
    public static IProxy PROXY;

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        ConfigRegistry.register(CONFIG);
        LETSRIDE_TAB_ITEMS = new AstroTab("letsride.items");
        LETSRIDE_TAB_BLOCKS = new AstroTab("letsride.blocks");
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        PROXY.preInit();
        LetsRideItems.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        PROXY.init();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        PROXY.postInit();
    }
}