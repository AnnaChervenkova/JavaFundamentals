package com.company;

import java.util.Scanner;

public class MultiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number1 = Integer.parseInt(scanner.nextLine());
        int sum;

        for (int i = number1; i <= 10; i++) {
            sum = number * i;
            System.out.printf("%d X %d = %d\n", number, i, sum);
        }
        if (number > 10 || number1 > 10) {
            sum = number * number1;
            System.out.printf("%d X %d = %d\n", number, number1, sum);
        }
    }
}
