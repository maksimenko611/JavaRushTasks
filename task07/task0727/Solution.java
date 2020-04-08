package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        ArrayList<String> DoubleAndTriple = new ArrayList<String>();
        int j;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.length()%2==0)
                DoubleAndTriple.add(s+" "+s);
            else DoubleAndTriple.add(s+" "+s+" "+s);
        }
        int k = 0;
        for (int i = 0; i < DoubleAndTriple.size(); i++)
            System.out.println(DoubleAndTriple.get(i));

    }
}