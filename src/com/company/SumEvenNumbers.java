package com.company;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        String[] arr = value.split(" ");
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        int evenSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }
        System.out.println(evenSum);
    }
}
