package com.company;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double heigth = Double.parseDouble(scanner.nextLine());
        double volume = (length * width * heigth) / 3;

        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", volume);
    }
}
