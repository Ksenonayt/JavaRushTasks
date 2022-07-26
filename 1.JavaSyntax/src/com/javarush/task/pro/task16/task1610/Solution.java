package com.javarush.task.pro.task16.task1610;

import java.time.LocalTime;

/* 
Тренировка на время
*/

public class Solution {

    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.ofSecondOfDay(50400);
    static LocalTime time2 = LocalTime.ofSecondOfDay(25208);
    static LocalTime time3 = LocalTime.ofSecondOfDay(2700).plusNanos(61);
    static LocalTime time4 = LocalTime.of(14, 0, 45, 1001);

    public static void main(String[] args) {
        //напишите тут ваш код
        LocalTime time = LocalTime.of(time1.getHour(), time2.getMinute(), time3.getSecond(), time4.getNano());
        System.out.println(time);
    }
}
