package com.officialy.letsride;

import net.minecraft.creativetab.CreativeTabs;
import com.officialy.letsride.proxy.ClientProxy;

public class Ref {

    public static final String MODID = "letsride";
    public static final String NAME = "Lets Ride";
    public static final String VERSION = "0.0.1a";
    public static final String CLIENT_PROXY = "com.officialy.letsride.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.officialy.letsride.proxy.ServerProxy";
    public static CreativeTabs LR_TAB = ClientProxy.letsRideTab;

}
