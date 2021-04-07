package com.company;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayInput = input.split(" ");

        for (int i = 0; i < arrayInput.length / 2; i++) {
            int oppositeIndex = arrayInput.length -1 - i;
            String variable = arrayInput[i];

            arrayInput[i] = arrayInput[oppositeIndex];

            arrayInput[oppositeIndex] = variable;
        }

        for (int i = 0; i < arrayInput.length; i++) {
            System.out.print(arrayInput[i] + " ");
        }
    }
}
