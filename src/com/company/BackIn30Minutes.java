package com.company;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int totalmin = hours * 60 + min + 30;
        int rhours = totalmin / 60;
        int rmin = totalmin % 60;

        if (rhours >= 24) {
            rhours = 0;
        }
        System.out.printf("%d:%02d", rhours, rmin);
    }
}

