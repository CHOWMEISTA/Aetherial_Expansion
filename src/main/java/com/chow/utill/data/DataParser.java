package com.chow.utill.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple data parsing mock class.
 */
public class DataParser {

    public static Map<String, String> parseKV(String data) {
        Map<String, String> map = new HashMap<>();
        for (String part : data.split(";")) {
            String[] kv = part.split("=");
            if (kv.length == 2) map.put(kv[0], kv[1]);
        }
        return map;
    }
}
