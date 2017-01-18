package com.officialy.letsride;

import com.mcmoddev.lib.config.ConfigurationHandler;
import com.officialy.letsride.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.officialy.letsride.config.LetsRideConfig;


@Mod(modid = Ref.MODID,
        name = Ref.NAME,
        version = Ref.VERSION,
        dependencies = "required-after:mmdlib")
public class LetsRide {

    @Instance(Ref.MODID)
    public LetsRide INSTANCE;

    @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.SERVER_PROXY)
    public static CommonProxy PROXY;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.INSTANCE.registerConfig(new LetsRideConfig(event.getSuggestedConfigurationFile()));
        ConfigurationHandler.INSTANCE.load();
        LetsRideContent.register();
        PROXY.preInit();
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