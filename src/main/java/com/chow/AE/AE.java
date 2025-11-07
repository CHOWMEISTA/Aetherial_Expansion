package com.chow.AE;

import net.fabricmc.api.ModInitializer;

public class AE implements ModInitializer {
    public static final String MOD_ID = "ae";

    @Override
    public void onInitialize() {
        RegistryHandler.registerAll();
        System.out.println("[Aetherial Expansion] Initialized.");
    }
}