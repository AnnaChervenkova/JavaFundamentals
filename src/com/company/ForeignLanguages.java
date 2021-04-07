package com.company;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine().toLowerCase();
        switch (country){
            case "usa":
            case "england":
                System.out.println("English");
                break;
            case "spain":
            case "argentina":
            case "mexico":
                System.out.println("Spanish");
                break;
                default:
                    System.out.println("unknown");
        }
    }
}
