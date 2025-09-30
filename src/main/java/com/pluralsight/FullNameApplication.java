package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        promptForAndBuildFullName();
    }

    private static void promptForAndBuildFullName() {

        print("First Name: ");
        String firstName = getString();

        print("Middle Name: ");
        String middleName = getString();

        print("Last Name: ");
        String lastName = getString();

        print("Suffix: ");
        String suffix = getString();

        String fullName = buildFullName(firstName, middleName, lastName, suffix);

        print(fullName);
    }

    private static String buildFullName(String firstName, String middleName, String lastName, String suffix) {
        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName = fullName + " " + middleName;
        }

        fullName = fullName + " " + lastName;

        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }
        return fullName;
    }

    private static String getString() {
        return scanner.nextLine().trim();
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
