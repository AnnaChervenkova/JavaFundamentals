package com.company;

import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int[] intArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }

        while (intArray.length > 1){
            int[] condensed = new int[intArray.length - 1];

            for (int index = 0; index < condensed.length; index++) {
                condensed[index] = intArray[index] + intArray[index + 1];
            }
            intArray = condensed;
        }
        for (int anIntArray : intArray) {
            System.out.print(anIntArray);
        }
    }
}
