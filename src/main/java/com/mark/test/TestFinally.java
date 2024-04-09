package com.mark.test;

public class TestFinally {

    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int temp = 0;
        try {
            temp = 1;
            int i = 1 / 0;
            return temp;
        } catch (Exception e) {
            temp = 2;
            return temp;
        } finally {
            temp = 3;
            return temp;
        }
    }
}
