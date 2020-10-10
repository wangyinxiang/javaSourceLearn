package com.learn.test.map;

import java.util.concurrent.ConcurrentHashMap;

public class TestConCurrentHashMap {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map  = new ConcurrentHashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");
        map.put("10", "10");
    }
}
