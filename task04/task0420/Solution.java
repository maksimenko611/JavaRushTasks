package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String num1 = reader.readLine();
         String num2 = reader.readLine();
         String num3 = reader.readLine();
 
         // Преобразование строки в число
         int n1 = Integer.parseInt(num1);
         int n2 = Integer.parseInt(num2);
         int n3 = Integer.parseInt(num3);
//Scanner y= new Scanner (System.in);
//        int n1=y.nextInt();
//        int n2=y.nextInt();
//        int n3=y.nextInt();
 
        // Сортировка введенных чисел
        if (n1 <= n2 && n2 <= n3) System.out.print("\n" + n3 + " " + n2 + " " + n1);
        else if (n1 <= n3 && n3 <= n2) System.out.print("\n" + n2 + " " + n3 + " " + n1);
        else if (n2 <= n1 && n1 <= n3) System.out.print("\n" + n3 + " " + n1 + " " + n2);
        else if (n2 <= n3 && n3 <= n1) System.out.print("\n" + n1 + " " + n3 + " " + n2);
        else if (n3 <= n1 && n1 <= n2) System.out.print("\n" + n2 + " " + n1 + " " + n3);
        else if (n3 <= n2 && n2 <= n1)System.out.print("\n" + n1 + " " + n2 + " " + n3);
    }
}
