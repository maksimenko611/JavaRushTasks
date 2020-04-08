package com.javarush.task.task07.task0717;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String s;
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner= new Scanner(System.in);
        for(int i = 0;i<10;i++){
            s=scanner.nextLine();
            list.add(s);
        }
        ArrayList<String> result = doubleValues(list);
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = 0 ;i<list.size();i+=2){
            list.add(i,list.get(i));
        }
        return list;
    }
}
