package com.company;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String input = scanner.nextLine();
        String pass = "";
        int counter = 0;

        for (int i = 0; i <= userName.length() - 1; i++) {
                pass += userName.charAt(userName.length() - i - 1);
        }
        while (!input.equals(pass)){
            counter++;
            if (counter >= 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (input.equals(pass)){
            System.out.printf("User %s logged in.", userName);
        }
    }
}
