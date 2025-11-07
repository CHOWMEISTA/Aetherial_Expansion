package com.chow.utill;

/**
 * Utility for color math and formatting.
 */
public class ColorUtil {

    public static int rgba(int r, int g, int b, int a) {
        return (a & 0xFF) << 24 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | (b & 0xFF);
    }

    public static void test() {
        System.out.println("[AE] ColorUtil ready");
    }
}
