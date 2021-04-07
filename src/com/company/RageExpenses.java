package com.company;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lostGames = Double.parseDouble(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        double countHeadset = Math.floor(lostGames / 2) * headsetPrice;
        double countMouse = Math.floor(lostGames / 3) * mousePrice;
        double countKeyboard = Math.floor(lostGames / 6) * keyboardPrice;

        if (lostGames >= 12){
            double countDisplay = Math.floor(lostGames / 12) * displayPrice;
            sum += countDisplay;
        }

         sum += countKeyboard + countMouse + countHeadset;
        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
