package com.officialy.letsride;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LetsRideTab extends CreativeTabs {

    public LetsRideTab(String label)
    {
        super("LetsRideTab");
    }
    @Override
    public Item getTabIconItem() {
        return LetsRideContent.GEAR;
    }
}
