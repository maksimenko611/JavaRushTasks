package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Collections;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> array = new ArrayList();
        int[] array1 = new int[5];
        int[] array2 = new int[2];
        int[] array3 = new int[4];
        int[] array4 = new int[7];
        int[] array5 = new int[0];
        for(int i = 0; i < array1.length; i++){
            array1[i] = i;
        }
        for(int i = 0; i < array2.length; i++){
            array2[i] = i;
        }
        for(int i = 0; i < array3.length; i++){
            array3[i] = i;
        }
        for(int i = 0; i < array4.length; i++){
            array4[i] = i;
        }
        array.addAll(0, Collections.singleton(array1));
        array.addAll(Collections.singleton(array2));
        array.addAll(Collections.singleton(array3));
        array.addAll(Collections.singleton(array4));
        array.addAll(Collections.singleton(array5));
        return array;

        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
