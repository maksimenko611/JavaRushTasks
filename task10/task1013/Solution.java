package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String soname;
        private  int age;
        private String address;
        private int phone;
        private String car;

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, String soname)
        {
            this.name = name;
            this.soname=soname;
        }

        public Human(String name, String soname, int age)
        {
            this.name = name;
            this.soname=soname;
            this.age=age;
        }

        public Human(String name, String soname, int age, String address)
        {
            this.name = name;
            this.soname=soname;
            this.age=age;
            this.address=address;
        }

        public Human(String name, String soname, int age, String address, int Phone, String car)
        {
            this.name = name;
            this.soname=soname;
            this.age=age;
            this.address=address;
            this.phone=phone;
            this.car=car;
        }

        public Human( String soname, int age, String address, int Phone)
        {
            this.soname=soname;
            this.age=age;
            this.address=address;
            this.phone=phone;
        }

        public Human(  int age, String address, int Phone)
        {
            this.age=age;
            this.address=address;
            this.phone=phone;
        }

        public Human(  String address, int Phone)
        {

            this.address=address;
            this.phone=phone;
        }
        public Human(   int Phone)
        {

            this.phone=phone;
        }
        public Human(   int Phone, String car)
        {
            this.phone=phone;
            this.car = car;
        }
    }

}
