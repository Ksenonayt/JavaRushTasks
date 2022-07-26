package com.javarush.task.pro.task13.task1309;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        Random random = new Random();


        for (int i = 0; i < 5; i++) {
            String generatedString = random.ints(0, 1000)
                    .limit(7)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            grades.put(generatedString, Math.random());
        }

    }
}
