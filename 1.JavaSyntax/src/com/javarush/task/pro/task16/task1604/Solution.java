package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1990, Calendar.JULY, 10);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        String day = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
        String outputDay = null;

        switch (day) {
            case "Monday":
                outputDay = "Понедельник";
                break;
            case "Tuesday":
                outputDay = "Вторник";
                break;
            case "Wednesday":
                outputDay = "Среда";
                break;
            case "Thursday":
                outputDay = "Четверг";
                break;
            case "Friday":
                outputDay = "Пятница";
                break;
            case "Saturday":
                outputDay = "Суббота";
                break;
            case "Sunday":
                outputDay = "Воскресенье";
                break;
            default: break;
        }
        return outputDay;
    }
}
