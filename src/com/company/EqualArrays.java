package com.company;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstArray = scanner.nextLine();
        String secondArray = scanner.nextLine();

        String[] first = firstArray.split(" ");
        String[] second = secondArray.split(" ");

        int [] firstInt = new int[first.length];
        int[] secondInt = new int[second.length];

        for (int i = 0; i < first.length; i++) {
            firstInt[i] = Integer.parseInt(first[i]);
        }
        for (int i = 0; i < second.length; i++) {
            secondInt[i] = Integer.parseInt(second[i]);
        }

        int sum = 0;

        if (firstInt.length == secondInt.length) {
            int index;
            for (index = 0; index < firstInt.length; index++){
                sum += firstInt[index];
                if (firstInt[index] != secondInt[index]){
                    System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                    return;
                }
            }
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
