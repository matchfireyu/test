package com.mark.test;

public class TestJvm {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10000) {
            i++;
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
