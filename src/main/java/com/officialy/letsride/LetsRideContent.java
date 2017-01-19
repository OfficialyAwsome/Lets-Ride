package com.officialy.letsride;

import com.officialy.letsride.items.ItemBolt;
import com.officialy.letsride.items.ItemGear;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LetsRideContent {

    public static ItemGear GEAR;
    public static ItemBolt BOLT;

    public static void register(){
        GEAR = new ItemGear();
        BOLT = new ItemBolt();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        GEAR.initModel();
        BOLT.initModel();

    }

}
