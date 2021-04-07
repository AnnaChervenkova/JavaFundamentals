package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {0, 0, 0};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt() * -1;
        }

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * -1);
        }
    }
}
