package com.javarush.task.task09.task0923;

/*
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuffer vowel = new StringBuffer();
        StringBuffer notVowel = new StringBuffer();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if ((' ') != c){
                if (isVowel(c)){
                    vowel.append(c);
                    vowel.append(" ");
                } else {
                    notVowel.append(c);
                    notVowel.append(" ");
                }
            }
        }
        System.out.println(vowel.toString());
        System.out.println(notVowel.toString());
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }}
