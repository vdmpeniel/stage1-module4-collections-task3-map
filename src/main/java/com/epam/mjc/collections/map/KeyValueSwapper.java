package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapMap = new HashMap<>();
        sourceMap.forEach( (key, value) -> {
            swapMap.put(value, key);
        });
        return swapMap;
    }

    public static void main(String[] args) {
        KeyValueSwapper kvs = new KeyValueSwapper();
        System.out.println(
        kvs.swap(
           Map.of(
                1, "Monday",
                2, "Tuesday",
                3, "Wednesday",
                4, "Thursday",
                5, "Friday",
                6, "Saturday",
                7, "Sunday")
           )
        );
    }
}
