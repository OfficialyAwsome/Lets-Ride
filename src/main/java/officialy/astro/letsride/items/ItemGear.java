package officialy.astro.letsride.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import officialy.astro.letsride.LetsRide;

public class ItemGear extends Item{

    public ItemGear() {
        setRegistryName(LetsRide.MODID, "gear");
        setUnlocalizedName(LetsRide.MODID + ".gear");
        setCreativeTab(LetsRide.LETSRIDE_TAB_ITEMS);
        GameRegistry.register(this);
    }

}
