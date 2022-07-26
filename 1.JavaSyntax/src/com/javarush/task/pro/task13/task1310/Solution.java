package com.javarush.task.pro.task13.task1310;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
Успеваемость студентов-2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        //напишите тут ваш код
        for (String key: grades.keySet())
        {
            System.out.println(key);
        }
    }

    private static double calculateAverage(ArrayList<Double> grades) {
        return grades.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public static Double getAverageMark() {
        //напишите тут ваш код
        ArrayList<Double> list = new ArrayList<>();
        for (String key: grades.keySet())
        {
            Double value = grades.get(key);
            list.add(value);
        }

        return calculateAverage(list);
    }
}
