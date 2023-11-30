package org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        RegistrationFields registrationFields = new RegistrationFields();

        System.out.print("Enter first name : ");
        String firstName = scanner.next();

        registrationFields.setFirstName(firstName);
        userRegistration.validateFirstName(registrationFields.getFirstName());

        System.out.print("Enter last name : ");
        String lastName = scanner.next();

        registrationFields.setLastName(lastName);
        userRegistration.validateLastName(registrationFields.getLastName());

        System.out.print("Enter email : ");
        String email = scanner.next();
        scanner.nextLine();

        registrationFields.setEmail(email);
        userRegistration.validateEmail(registrationFields.getEmail());

        System.out.print("Enter mobile number: ");
        String phoneNum = scanner.nextLine();

        registrationFields.setPhoneNum(phoneNum);
        userRegistration.validatePhoneNum(registrationFields.getPhoneNum());

        System.out.print("Enter password: ");
        String pass = scanner.next();

        registrationFields.setPassword(pass);
        userRegistration.validatePassword(registrationFields.getPassword());

    }
}