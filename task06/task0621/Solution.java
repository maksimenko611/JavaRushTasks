package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather.toString());
        System.out.println(catGrandmother.toString());
        System.out.println(catFather.toString());
        System.out.println(catMother.toString());
        System.out.println(catSon.toString());
        System.out.println(catDaughter.toString());
    }

    public static class Cat {
        private String name;
        private Cat parentMom;
        private Cat parentDad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMom, Cat parentDad) {
            this.name = name;
            this.parentMom = parentMom;
            this.parentDad = parentDad;
        }

        @Override
        public String toString() {
            if (parentMom == null && parentDad == null)
                return "The cat's name is " + name + ", no mother, no father";
            if (parentDad == null)
                return "The cat's name is " + name + ", mother is " + parentMom.name + ", no father";
            if (parentMom == null)
                return "The cat's name is " + name + ", no mother, father is " + parentDad.name;
            return "The cat's name is " + name + ", mother is " + parentMom.name + ", father is " + parentDad.name;
        }}}