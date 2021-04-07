package com.company;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int[] array = new int[arr.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            boolean isBigger = true;
            int currentNum = array[i];

            for (int index = i + 1; index < array.length; index++) {
                int num = array[index];
                if (currentNum <= num) {
                    isBigger = false;
                }
            }
            if (isBigger) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.print(array[array.length - 1]);
    }
}