package com.company;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        switch (group){
            case "Students":
                if (day.equals("Friday")){
                    totalPrice = countStudents * 8.45;
                }else if (day.equals("Saturday")){
                    totalPrice = countStudents * 9.80;
                }else if (day.equals("Sunday")){
                    totalPrice = countStudents * 10.46;
                }
                if (countStudents >= 30){
                    totalPrice = 0.85 * totalPrice;
                }
                break;
            case "Business":
                if (countStudents >= 100){
                    countStudents -= 10;
                }
                if (day.equals("Friday")){
                    totalPrice = countStudents * 10.90;
                }else if (day.equals("Saturday")){
                    totalPrice = countStudents * 15.60;
                }else if (day.equals("Sunday")){
                    totalPrice = countStudents * 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    totalPrice = countStudents * 15;
                }else if (day.equals("Saturday")){
                    totalPrice = countStudents * 20;
                }else if (day.equals("Sunday")){
                    totalPrice = countStudents * 22.50;
                }
                if (countStudents >= 10 && countStudents <= 20){
                    totalPrice = 0.95 * totalPrice;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
