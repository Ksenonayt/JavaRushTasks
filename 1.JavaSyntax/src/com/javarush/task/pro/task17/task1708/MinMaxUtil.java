package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public static int min(int i1, int i2) {
        return Math.min(i1, i2);
    }
    public static int min(int i1, int i2, int i3) {
        return Math.min(Math.min(i1, i2), i3);
    }
    public static int min(int i1, int i2, int i3, int i4) {
        return Math.min(Math.min(i1, i2), Math.min(i3, i4));
    }
    public static int min(int i1, int i2, int i3, int i4, int i5) {
        return Math.min(Math.min(Math.min(i1, i2), Math.min(i3, i4)), i5);
    }
    public static int max(int i1, int i2) {
        return Math.max(i1, i2);
    }
    public static int max(int i1, int i2, int i3) {
        return Math.max(Math.max(i1, i2), i3);
    }
    public static int max(int i1, int i2, int i3, int i4) {
        return Math.max(Math.max(i1, i2), Math.max(i3, i4));
    }
    public static int max(int i1, int i2, int i3, int i4, int i5) {
        return Math.max(Math.max(Math.max(i1, i2), Math.max(i3, i4)), i5);
    }
}
