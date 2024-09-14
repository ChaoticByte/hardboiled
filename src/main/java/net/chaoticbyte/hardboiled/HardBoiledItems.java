package net.chaoticbyte.hardboiled;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HardBoiledItems {
    // default food component
    public static final FoodComponent foodComponent = new FoodComponent.Builder()
        .hunger(3)
        .snack()
        .build();
    // register item
    public static Item register(String id) {
        Item.Settings settings = new Item.Settings().food(foodComponent);
        Identifier itemId = Identifier.of(HardBoiled.MOD_ID, id);
        Item item = new Item(settings);
        return Registry.register(Registries.ITEM, itemId, item);
    }
    // dummy init method
    public static void init() {}
    // items
    public static final Item HARDBOILED_EGG = register("hardboiled_egg");
}
