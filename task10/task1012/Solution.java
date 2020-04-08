package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Количество букв
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (Character ch: alphabet){
            int count = 0;

            for (String str: list){
                int res = 0;
                while (res != -1){
                    res = str.indexOf(ch.toString(), res);
                    //System.out.println(str.indexOf((int) ch, res));
                    if (res != -1)
                    {
                        count++;
                        res++;
                    }
                }
            }

            System.out.println(ch + " " + count);
        }
    }
}