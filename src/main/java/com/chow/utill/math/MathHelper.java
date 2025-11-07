package com.chow.utill.math;

/**
 * Math helpers used across AE.
 */
public class MathHelper {

    public static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }

    public static void test() {
        System.out.println("[AE] MathHelper ready");
    }
}
