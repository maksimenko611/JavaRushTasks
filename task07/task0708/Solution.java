    package com.javarush.task.task07.task0708;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.Collections;

    /*
    Самая длинная строка
    */

    public class Solution {
        private static ArrayList<String> strings;

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 5; i++){
                String s = reader.readLine();
                list.add(s);}


            //Find largest string(s)
            String max = Collections.max(list , Comparator.comparing(s -> s.length()));

            ArrayList<string> maxLengthStrs = new ArrayList<string>;

            foreach (var str in list)
            {
                if(str.length == max)
                {
                    maxLengthStrs.Add(str);
                    System.out.println(str);
                }
            }

            //maxLengthStrs -- строка(и) с наибольшей длинной
        }