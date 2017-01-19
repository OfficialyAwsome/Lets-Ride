package com.officialy.letsride.proxy;

import com.officialy.letsride.LetsRideContent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends ServerProxy {

    @Override
    public void preInit() {
        LetsRideContent.initModels();
    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }

}