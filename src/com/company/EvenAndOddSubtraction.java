package com.company;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String array = scanner.nextLine();

        String[] arrayString = array.split(" ");
        int[] integersArray = new int[arrayString.length];

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arrayString.length; i++) {
            integersArray[i] = Integer.parseInt(arrayString[i]);
            if (integersArray[i] % 2 == 0) {
                evenSum += integersArray[i];
            }else {
                oddSum += integersArray[i];
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
