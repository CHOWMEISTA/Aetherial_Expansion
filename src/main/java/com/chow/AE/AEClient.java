package com.chow.AE;

import net.fabricmc.api.ClientModInitializer;

public class AEClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[Aetherial Expansion] Client init.");
    }
}