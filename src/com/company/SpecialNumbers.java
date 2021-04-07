package com.company;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int newNum;

        for (int i = 1; i <= num; i++) {
            newNum = i;
            int sum = 0;

            while (newNum > 0) {
                sum += newNum % 10;
                newNum = newNum / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True\n", i);
            }else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
