package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        promptForAndBuildFullName();
    }

    private static void promptForAndBuildFullName() {
        //type variable assign  of type
        Person person   = new Person();

        fillPerson(person);

        String fullName = buildFullName(person);

        print(fullName);
    }

    private static void fillPerson(Person person) {
        print("First Name: ");
        person.setFirstName(getString());

        print("Middle Name: ");
        person.setMiddleName(getString());

        print("Last Name: ");
        person.setLastName(getString());

        print("Suffix: ");
        person.setSuffix(getString());
    }

    private static String buildFullName(Person person) {
        String fullName = person.getFirstName();

        if (!person.getMiddleName().isEmpty()) {
            fullName = fullName + " " + person.getMiddleName();
        }

        fullName = fullName + " " + person.getLastName();

        if (!person.getSuffix().isEmpty()) {
            fullName = fullName + ", " + person.getSuffix();
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
