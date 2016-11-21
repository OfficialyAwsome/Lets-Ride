package officialy.astro.letsride;

import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import officialy.astro.letsride.items.ItemGear;

public class LetsRideItems {

    public static Item GEAR;

    public static void register(){
        GEAR = new ItemGear();


    }

}
