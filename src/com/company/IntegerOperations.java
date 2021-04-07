package com.company;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!"END".equals(scanner.nextLine())){
            if (scanner.hasNextInt()){
                System.out.printf("%s is integer type\n", scanner.next());
            } else if (scanner.hasNextDouble()) {
                System.out.printf("%s is floating point type\n", scanner.next());
            }else if (scanner.hasNext()){
                System.out.printf("%s is string type\n", scanner.next());
            }else if (scanner.hasNextBoolean()){
                System.out.printf("%s is boolean type\n", scanner.nextLine());
            }else {
                System.out.printf("%s is character type\n", scanner.next());
            }
         }
    }
}
