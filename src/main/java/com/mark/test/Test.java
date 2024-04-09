package com.mark.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //testList();
        //testInt();
        testArr();
    }

    private static void testList() {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.forEach(System.out::println);
    }

    private static void testInt() {
        Integer a = 122;
        Integer b = 122;
        System.out.println(a == b);//结果为true;
        System.out.println(a.equals(b));//结果为true;
        Integer c = 222;
        Integer d = 222;
        System.out.println(c == d);//结果为false;
        System.out.println(c.equals(d));//结果为true;
    }

    private static void testArr() {
        String[] strArr = new String[5];
        System.out.println(strArr.length);
    }
}
