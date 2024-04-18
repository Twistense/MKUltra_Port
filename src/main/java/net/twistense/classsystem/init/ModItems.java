package net.twistense.classsystem.init;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.twistense.classsystem.ClassSystem.MOD_ID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    public static final DeferredRegister.Items CLASS_ICON = DeferredRegister.createItems(MOD_ID);


    public static final DeferredItem<Item> SUN_ICON = CLASS_ICON.registerSimpleItem("sun_icon", new Item.Properties());
    public static final DeferredItem<Item> MOON_ICON = CLASS_ICON.registerSimpleItem("moon_icon", new Item.Properties());
    public static final DeferredItem<Item> DESPERATE_ICON = CLASS_ICON.registerSimpleItem("desperate_icon", new Item.Properties());
    public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.registerSimpleItem("diamond_dust", new Item.Properties());


}
