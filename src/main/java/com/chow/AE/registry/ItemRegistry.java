package com.chow.AE.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.chow.AE.AE;

public class ItemRegistry {
    public static final Item EXAMPLE_ITEM = new Item(new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(AE.MOD_ID, "example_item"), EXAMPLE_ITEM);
        System.out.println("[AE] Items registered.");
    }
}