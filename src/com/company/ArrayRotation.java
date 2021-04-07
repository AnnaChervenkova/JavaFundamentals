package com.company;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < num % array.length; index++) {
            String lastString = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = lastString;
        }
        System.out.println(String.join(" ", array));
    }
}
