package com.mark.test;

import cn.hutool.core.util.RandomUtil;

public class HutoolTest {

    public static void main(String[] args) {
        //testStr();
        testRandom();
    }

    private static void testRandom() {
        System.out.println(RandomUtil.randomString(14));
    }

    private static void testStr() {
        //xxxx
    }
}
