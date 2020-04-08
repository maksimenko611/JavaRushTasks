package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("Ivan", true, 63);
        Human ded2 = new Human("IvanN", true, 64);
        Human granny1 = new Human("Tanya", false, 45);
        Human granny2 = new Human("Zoya", false, 75);
        Human father = new Human("Sergey", true, 49, ded1, granny1);
        Human mother = new Human("Sveta", false, 48, ded2, granny2);
        Human kid1 = new Human("Vasya", true, 18, father, mother);
        Human kid2 = new Human("Petya", true, 16, father, mother);
        Human kid3 = new Human("Katya", false, 12, father, mother);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(granny1);
        System.out.println(granny2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }// напишите тут ваш код

        public String toString() {
            String text = "";
            text += "имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother;
            }

            return text;
        }
    }
}