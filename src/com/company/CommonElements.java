package com.company;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstArray = scanner.nextLine();
        String secondArray = scanner.nextLine();

        String[] first = firstArray.split(" ");
        String[] second = secondArray.split(" ");

        for (String aSecond : second) {
            for (String aFirst : first) {
                if (aSecond.equals(aFirst)) {
                    System.out.print(aSecond + " ");
                }
            }
        }
    }
}