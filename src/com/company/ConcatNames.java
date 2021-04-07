package com.company;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();
        String charOne = scanner.nextLine();

        System.out.printf("%s%s%s", nameOne, charOne, nameTwo);
    }
}
