package com.chow.AE.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerHandler {
    public static void info(String msg) {
        System.out.println("[AE] " + ts() + " INFO: " + msg);
    }
    public static void warn(String msg) {
        System.out.println("[AE] " + ts() + " WARN: " + msg);
    }
    public static void error(String msg) {
        System.err.println("[AE] " + ts() + " ERROR: " + msg);
    }
    private static String ts() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
}