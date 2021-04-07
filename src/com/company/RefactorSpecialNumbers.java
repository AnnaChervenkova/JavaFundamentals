package com.company;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
           int newNum = i;
           int sum = 0;
            while (i > 0){
                sum += i % 10;
                i = i / 10;
            }
            boolean isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", newNum, isSpecialNum);
        }
    }
}
