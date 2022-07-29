package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = bufferedReader.readLine();
        FileInputStream fis = new FileInputStream(filePath);

        Scanner scanner = new Scanner(fis);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(builder.toString());

        bufferedReader.close();
        scanner.close();
    }
}