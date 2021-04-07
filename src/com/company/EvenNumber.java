package com.company;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenNumber = Integer.parseInt(scanner.nextLine());

        while (evenNumber % 2 != 0) {
            System.out.println("Please write an even number.");
            evenNumber = scanner.nextInt();
        }
        if (evenNumber % 2 == 0) {
            System.out.printf("The number is: %d", Math.abs(evenNumber));
        }
    }
}
