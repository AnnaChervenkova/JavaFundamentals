package com.company;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        double countStudents = Double.parseDouble(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double sum = lightsabersPrice * (countStudents + Math.ceil(0.1 * countStudents ))
                + robesPrice * countStudents
                + beltsPrice * countStudents - (countStudents/6 * beltsPrice);

        if (sum <= amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        }else {
            System.out.printf("Ivan Cho will need %.2flv more.", (sum - amountMoney));
        }
    }
}
