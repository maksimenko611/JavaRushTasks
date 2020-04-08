package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        //напишите тут ваш код   int[] mas = new int[20];
        int[] mas = new int [20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = mas[0];
        int minimum= mas[0];
        for (int ma : mas) {
            if (ma>maximum)
                maximum = ma;
        }
        minimum = maximum;
        for (int ma : mas) {
            if (ma < minimum)
                minimum = ma;
        }

        System.out.print(maximum + " " + minimum);
        //System.out.println(minimum);
    }
}
