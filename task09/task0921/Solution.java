package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (true)
        {
            try
            {
                int a = Integer.parseInt(bufferedReader.readLine());
                arrayList.add(a);
            }
            catch ( NumberFormatException | IOException e)
            {
                break;
            }}
        for (int b: arrayList) {
            System.out.println(b);
        }
    }
}