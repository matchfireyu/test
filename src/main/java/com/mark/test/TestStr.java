package com.mark.test;

public class TestStr {

    public static void main(String[] args) {
        testPass();
    }

    private static void testPass() {
        Person zs = new Person("张三2");
        Person ls = new Person("李四");
        testPassPerson(zs, ls);
        System.out.println("zs2:" + zs.getName());
        System.out.println("ls2:" + ls.getName());
    }

    private static void testPassPerson(Person zs, Person ls) {
        Person temp = zs;
        zs = ls;
        ls = temp;
        System.out.println("zs:" + zs.getName());
        System.out.println("ls:" + ls.getName());
        zs.setName("aaaaa");
    }

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
