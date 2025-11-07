package com.chow.utill.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Handles reading and writing to simple data files.
 */
public class FileHelper {

    public static void writeLines(Path file, List<String> lines) {
        try {
            Files.createDirectories(file.getParent());
            Files.write(file, lines);
            System.out.println("[AE] Wrote file: " + file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readLines(Path file) {
        try {
            return Files.readAllLines(file);
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }
}
