package com.officialy.letsride.items;

import com.officialy.letsride.Ref;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBolt extends Item {

    public ItemBolt() {
        setRegistryName(Ref.MODID, "bolt");
        setUnlocalizedName("bolt");
        setCreativeTab(Ref.LR_TAB);
        GameRegistry.register(this);
    }

}
