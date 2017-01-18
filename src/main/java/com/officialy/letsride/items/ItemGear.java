package com.officialy.letsride.items;

import com.officialy.letsride.Ref;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemGear extends Item{

    public ItemGear() {
        setRegistryName(Ref.MODID, "gear");
        setUnlocalizedName("gear");
        setCreativeTab(Ref.LR_TAB);
        GameRegistry.register(this);
    }

}
