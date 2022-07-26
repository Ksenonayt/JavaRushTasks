package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код
    public static Month[] getWinterMonths() {
        Month[] list = {DECEMBER, JANUARY, FEBRUARY};

        return list;
    }

    public static Month[] getSpringMonths() {
        Month[] list = {MARCH, APRIL, MAY};

        return list;
    }

    public static Month[] getSummerMonths() {
        Month[] list = {JUNE, JULY, AUGUST};

        return list;
    }

    public static Month[] getAutumnMonths() {
        Month[] list = {SEPTEMBER, OCTOBER, NOVEMBER};

        return list;
    }
}

