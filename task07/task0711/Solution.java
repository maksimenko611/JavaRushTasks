package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        int nEnd = list.size() - 1;
        for (int i = 0; i < 13; i++) {
            String s = (String) list.get(nEnd);
            list.remove(nEnd);
            list.add(0,s);
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }
    }
}