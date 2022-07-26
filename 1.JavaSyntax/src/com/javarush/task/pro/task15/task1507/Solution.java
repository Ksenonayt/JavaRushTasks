package com.javarush.task.pro.task15.task1507;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        final List<String> lines = Files.readAllLines(Paths.get(scanner.next()));
        for (int i = 0; i < lines.size(); i = i + 2) {
            System.out.println(lines.get(i));
        }

    }
}

