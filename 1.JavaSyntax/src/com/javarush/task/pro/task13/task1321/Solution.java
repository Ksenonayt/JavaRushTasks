package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if (ru.equalsIgnoreCase("понедельник")) {
            en = "Monday";
            return en;
        }
        else if (ru.equalsIgnoreCase("вторник")) {
            en = "Tuesday";
            return en;
        }
        else if (ru.equalsIgnoreCase("среда")) {
            en = "Wednesday";
            return en;
        }
        else if (ru.equalsIgnoreCase("четверг")) {
            en = "Thursday";
            return en;
        }
        else if (ru.equalsIgnoreCase("пятница")) {
            en = "Friday";
            return en;
        }
        else if (ru.equalsIgnoreCase("суббота")) {
            en = "Saturday";
            return en;
        }
        else if (ru.equalsIgnoreCase("воскресенье")) {
            en = "Sunday";
            return en;
        }
        else {
            en = "Недействительный день недели";
            return en;
        }
    }
}
