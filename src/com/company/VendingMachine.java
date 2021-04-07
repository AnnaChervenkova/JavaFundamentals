package com.company;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coins;
        double sum = 0;

        while (!"Start".equals(coins = scanner.nextLine())){
            if (coins.equals("2") || coins.equals("1") || coins.equals("0.5") || coins.equals("0.2") || coins.equals("0.1")){
                sum += Double.parseDouble(coins);
            }else {
                System.out.printf("Cannot accept %.2f\n", Double.parseDouble(coins));
            }
        }

       String endWord = scanner.nextLine();
        while (!"End".equals(endWord)){
            switch (endWord) {
                case "Nuts":
                    if (sum >= 2) {
                        sum -=2;
                        System.out.printf("Purchased %s\n", endWord);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.printf("Purchased %s\n", endWord);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.printf("Purchased %s\n", endWord);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.printf("Purchased %s\n", endWord);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1) {
                        sum -= 1;
                        System.out.printf("Purchased %s\n", endWord);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product\n");
            }
            endWord = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
