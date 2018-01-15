package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Tom", 21, "SPN");
        System.out.println(man1);
        Man man2 = new Man("Tom", 21, "SPN");
        System.out.println(man2);
        Woman woman1 = new Woman("Eva", 23, "EKB");
        System.out.println(woman1);
        Woman woman2 = new Woman("Eva", 23, "EKB");
        System.out.println(woman2);

    }

    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }
    }
        public static class Woman{
            String name, address;
            int age;
            public Woman(String name, int age, String address){
                this.name = name;
                this.age = age;
                this.address = address;
                System.out.println(name + " " + age + " " + address);
            }
    }
}
