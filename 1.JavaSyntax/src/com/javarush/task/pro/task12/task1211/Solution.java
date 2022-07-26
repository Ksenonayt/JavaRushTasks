package com.javarush.task.pro.task12.task1211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Сортировка пузырьком
*/

public class Solution {

    public static int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }


    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
