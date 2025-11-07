package com.chow.AE.systems;

import java.util.HashMap;
import java.util.Map;

public class CooldownSystem {
    private static final Map<String, Long> cd = new HashMap<>();
    public static boolean ready(String key, long ms) {
        long now = System.currentTimeMillis();
        Long last = cd.get(key);
        if (last == null || now - last >= ms) { cd.put(key, now); return true; }
        return false;
    }
}