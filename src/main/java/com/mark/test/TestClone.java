package com.mark.test;

public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("张三", 12);
        p1.cat = new Cat("小猫");
        Person p2 = p1.clone();
        p2.setName("aaa");
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        System.out.println(p1 == p2);
        System.out.println(p1.cat == p2.cat);
        p2.getCat().setName("xxxx");
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
    }

    static class Person implements Cloneable {
        private String name;
        private int age;

        private Cat cat;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        protected Person clone() throws CloneNotSupportedException {
            return (Person) super.clone();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Cat getCat() {
            return cat;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", cat=" + cat +
                    '}';
        }
    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
