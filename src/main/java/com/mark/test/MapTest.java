package com.mark.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a","aaa");
        map.put("1","bbb");
        map.put("12","ccc");
        map.put("a","ddd");
        System.out.println(map);
    }
}
