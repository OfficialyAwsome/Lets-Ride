package com.officialy.letsride;

import net.minecraft.item.Item;
import com.officialy.letsride.items.ItemBolt;
import com.officialy.letsride.items.ItemGear;

public class LetsRideContent {

    public static Item GEAR;
    public static Item BOLT;

    public static void register(){
        GEAR = new ItemGear();
        BOLT = new ItemBolt();
    }

}
