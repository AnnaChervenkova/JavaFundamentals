package com.company;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String[] first = new String[num];
        String[] second = new String[num];

        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (i % 2 == 0){
                first[i] = input[0];
                second[i] = input[1];
            }else {
                first[i] = input[1];
                second[i] = input[0];
            }
        }
        System.out.println(String.join(" ", first));
        System.out.println(String.join(" ", second));
    }
}
