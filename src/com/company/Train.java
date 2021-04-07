package com.company;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] train = new int[number];
        int sum = 0;

        for (int i = 0; i < train.length; i++) {
            train[i] = scanner.nextInt();
            sum += train[i];
        }
        for (int aTrain : train) {
            System.out.print(aTrain + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
