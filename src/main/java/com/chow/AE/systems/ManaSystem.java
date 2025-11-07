package com.chow.AE.systems;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ManaSystem {
    private static final Map<UUID, Integer> mana = new HashMap<>();

    public static int get(UUID id) { return mana.getOrDefault(id, 100); }
    public static void set(UUID id, int v) { mana.put(id, Math.max(0, v)); }
}