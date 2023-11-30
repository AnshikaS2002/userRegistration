package org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    void validateFirstName(String firstName) {
        String nameRegex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(firstName);

        if (matcher.matches()) {
            System.out.println("Valid first name");
        } else {
            System.out.println("Invalid first name");
        }
    }

    void validateLastName(String lastName) {
        String nameRegex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(lastName);

        if (matcher.matches()) {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid last name");
        }
    }

    void validateEmail(String email) {
        String emailRegex = "[a-z0-9]+(\\.[a-z0-9]*)*@[a-z0-9]+\\.[a-z]+(\\.[a-z]*)*";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }

    void validatePhoneNum(String phoneNum) {
        String numRegex = "[0-9]{2}\\s[0-9]{10}";
        Pattern pattern = Pattern.compile(numRegex);
        Matcher matcher = pattern.matcher(phoneNum);

        if (matcher.matches()) {
            System.out.println("Valid Phone num");
        } else {
            System.out.println("Invalid phone num");
        }
    }

    void validatePassword(String pass) {
        String passRegex = ".*[A-Z].*";
        Pattern pattern = Pattern.compile(passRegex);
        Matcher matcher = pattern.matcher(pass);

        if (matcher.matches() && pass.length() >= 8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

}
