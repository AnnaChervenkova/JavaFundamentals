package com.company;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] numberCount = new int[num];

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numberCount[i] = number;
        }
        for (int i = numberCount.length - 1; i >= 0; i--) {
            System.out.print(numberCount[i] + " ");
        }
    }
}
