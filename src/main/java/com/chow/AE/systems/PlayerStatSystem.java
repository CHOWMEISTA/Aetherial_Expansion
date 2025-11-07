package com.chow.AE.systems;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerStatSystem {
    private static final Map<UUID, Integer> power = new HashMap<>();
    public static int getPower(UUID id) { return power.getOrDefault(id, 0); }
    public static void addPower(UUID id, int v) { power.put(id, getPower(id) + v); }
}