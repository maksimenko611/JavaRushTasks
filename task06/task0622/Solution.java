package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



/*
Числа по возрастанию
*/


        public class Solution {
            public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> list = new ArrayList<String>();

                int N = Integer.parseInt(reader.readLine()); //кол-во строк
                int M = Integer.parseInt(reader.readLine());//кол-во первых строк, которые надо перенести в конец
                for (int i=0; i<N; i++){ // считываю N строк и добавляю их в список
                    String s = reader.readLine();
                    list.add(s);

                    //напишите тут ваш кодfor (int i=0;i<list.size();i++){
                    System.out.println(list.get(i));
                }
            }}
