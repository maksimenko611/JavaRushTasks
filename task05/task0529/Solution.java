package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc=new Scanner(System.in);
        int num;
        int sum=0;
        while(true){
            String s=sc.nextLine();
            num=sc.nextInt();
            sum=sum+num;
            if(s.equals("сумма"))
                break;

        }
        System.out.println(sum);
        //напишите тут ваш код

    }
}
