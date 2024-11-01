package net.chaoticbyte.hardboiled;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class HardBoiledItems {
    // default food component
    public static final FoodComponent foodComponent = new FoodComponent.Builder()
        .nutrition(3)
        .build();
    // register item
    public static Item register(String id) {
        final RegistryKey<Item> regKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HardBoiled.MOD_ID, id));
        Item.Settings settings = new Item.Settings().food(foodComponent);
        return Items.register(regKey, Item::new, settings);
    }
    // dummy init method
    public static void init() {}
    // items
    public static final Item HARDBOILED_EGG = register("hardboiled_egg");
}
