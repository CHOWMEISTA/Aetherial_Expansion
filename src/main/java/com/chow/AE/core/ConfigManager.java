package com.chow.AE.core;

import java.nio.file.Files;
import java.nio.file.Path;

public class ConfigManager {
    public static Path getConfigDir() {
        return Path.of(".", "config", "ae");
    }
    public static void ensure() {
        try { Files.createDirectories(getConfigDir()); } catch (Exception ignored) {}
    }
}