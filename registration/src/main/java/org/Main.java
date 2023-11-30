package org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name : ");
        String firstName = scanner.next();

        RegistrationFields registrationFields = new RegistrationFields();
        registrationFields.setFirstName(firstName);

        userRegistration.validateFirstName(registrationFields.getFirstName());
    }
}