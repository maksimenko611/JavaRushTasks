package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++){

            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }

        int array1[] = new int[10];

        int array2[] = new int[10];

        for (int i = 0; i < 10; i++){
            array1[i] = array[i];
        }
        for ( int i = 10; i < 20; i++){
            for (int j = 0; j < 10; j++)

                array2[j] = array[i];
            System.out.println(array2[9]);
        }
        }
    }

