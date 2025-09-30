package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Middle Name: ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName = fullName + " " + middleName;
        }

        fullName = fullName + " " + lastName;

        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }

        System.out.println(fullName);


    }
}
