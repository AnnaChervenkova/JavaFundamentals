package com.company;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        int symbolNumber = (int) symbol;

        if (symbolNumber >= 65 && symbolNumber <= 90) {
            System.out.println("upper-case");
        }else if (symbolNumber >= 97 && symbolNumber <= 122){
            System.out.println("lower-case");
        }
    }
}
