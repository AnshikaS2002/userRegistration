package org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        String nameRegex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }

    public boolean validateLastName(String lastName) {
        String nameRegex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();
    }

    public boolean validateEmail(String email) {
        String emailRegex = "[a-z0-9]+(\\.[a-z0-9]*)*@[a-z0-9]+\\.[a-z]+(\\.[a-z]*)*";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public boolean validatePhoneNum(String phoneNum) {
        String numRegex = "[0-9]{2}\\s[0-9]{10}";
        Pattern pattern = Pattern.compile(numRegex);
        Matcher matcher = pattern.matcher(phoneNum);

        return matcher.matches();
    }

    public boolean validatePassword(String pass) {
        String passRegex = "(^(?=.*[A-Z])(?=.*\\d).(?=.*\\W).*$){8,}";
        Pattern pattern = Pattern.compile(passRegex);
        Matcher matcher = pattern.matcher(pass);

        return matcher.matches();
    }

}
