package com.mark.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mianshi1 {

    //1.a不与x比
    //2.c不与x、z比
    //3.不能重复
    public static void main(String[] args) {

        //competitor();

        char[] longDui = {'a', 'b', 'c'};
        char[] huDui = {'x', 'y', 'z'};

        test1(longDui, huDui);

        /*for (int i = 0; i < 3; i++) {
            Map<Character, Character> map = new HashMap<>();
            char longCh = longDui[i];
            for (int y = 0; y < 3; y++) {
                char huCh = longDui[y];
                match(map, longCh, huCh);
            }
        }*/
    }

    private static void test1(char[] longDui, char[] huDui) {
        List<Character[]> allList = new ArrayList<>();
        for (int l = 0; l < longDui.length; l++) {
            for (int h = 0; h < huDui.length; h++) {
                Character[] arr = {longDui[l], huDui[h]};
                allList.add(arr);
            }
        }
        System.out.println("所有匹配列表：");
        allList.forEach(chr -> {
            System.out.println(chr[0] + "-" + chr[1]);
        });

        for (int i = 0; i < 3; i++) {
            Map<Character, Character> map = new HashMap<>();
            Character[] arr = allList.get(i);
            if (isMatch(arr[0], arr[1]) && !isSelected(map, arr[0], arr[1])) {
                map.put(arr[0], arr[1]);
                for (int x = 3; x < allList.size(); x++) {
                    Character[] arr2 = allList.get(x);
                    if (isMatch(arr2[0], arr2[1]) && !isSelected(map, arr2[0], arr2[1])) {
                        map.put(arr2[0], arr2[1]);
                        for (int z = 6; z < allList.size(); z++) {
                            Character[] arr3 = allList.get(z);
                            if (isMatch(arr3[0], arr3[1]) && !isSelected(map, arr3[0], arr3[1])) {
                                map.put(arr3[0], arr3[1]);
                            }
                        }
                    }
                }
            }
            if (map.size() == 3) {
                System.out.println(map);
            }
        }
    }

    private static void test2(char[] longDui, char[] huDui) {
        for (int a = 0; a < 3; a++) {
            Map<Character, Character> map = new HashMap<>();
            for (int b = 0; b < 3; b++) {

                for (int c = 0; c < 3; c++) {

                }
            }
        }
    }

    public static void match(Map<Character, Character> map, char longCh, char huCh) {
        if (isMatch(longCh, huCh) && !isSelected(map, longCh, huCh)) {
            map.put(longCh, huCh);
        }
    }

    public static void match() {

    }

    public static boolean isMatch(char longCh, char huCh) {
        if (longCh == 'a' && huCh == 'x') {
            return false;
        }
        if (longCh == 'c' && (huCh == 'x' || huCh == 'z')) {
            return false;
        }
        return true;
    }

    public static boolean isSelected(Map<Character, Character> map, char longCh, char huCh) {
        if (map == null) {
            return false;
        }
        if (map.containsKey(longCh) || map.containsValue(huCh)) {
            return true;
        }
        return false;
    }




        public static void competitor(){

            String[] s={"x","y","z"};

            for(int i=0;i<s.length;i++){
                for(int j=0;j<s.length;j++){
                    for(int k=0;k<s.length;k++){
                        String a=s[i];
                        String b=s[j];
                        String c=s[k];
                        if((!a.equals(b))&&(!b.equals(c))&&(!a.equals(c))&(!"x".equals(a))&&(!"x".equals(c))&&("y".equals(c))){
                            System.out.println("比赛名单如下：");
                            System.out.println("a  VS  "+a);
                            System.out.println("b  VS  "+b);
                            System.out.println("c  VS  "+c);
                        }
                    }
                }
            }

        }


}
