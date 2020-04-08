package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
        public static void main(String[] args) throws Exception {
            int[] list = new int[10];

            for (int i = 0; i < list.length; i++){
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String s = reader.readLine();
                int a = Integer.parseInt(s);
                list[i] = a;
            }


            for (int i = 0; i < 10; i++) {
                int j = list.length - i - 1;
                System.out.println(list[j]);
            }}}