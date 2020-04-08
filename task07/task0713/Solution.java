package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayBase = new ArrayList<Integer>();
        ArrayList<Integer> arrayD3 = new ArrayList<Integer>();
        ArrayList<Integer> arrayD2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayOther = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            arrayBase.add(x);
            if (x % 3 == 0) {
                arrayD3.add(x);
            }
            if (x % 2 == 0) {
                arrayD2.add(x);
            }
            if (x % 2 != 0 && x % 3 != 0) {
                arrayOther.add(x);
            }

        }
        Solution.printList(arrayD3);
        Solution.printList(arrayD2);
        Solution.printList(arrayOther);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}