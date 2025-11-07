package com.chow.AE;

import com.chow.AE.registry.BlockRegistry;
import com.chow.AE.registry.ItemRegistry;

public class RegistryHandler {
    public static void registerAll() {
        BlockRegistry.register();
        ItemRegistry.register();
    }
}