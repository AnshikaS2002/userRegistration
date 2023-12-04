package org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String firstName) throws InvalidFirstNameException {
        String nameRegex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(firstName);

        if (matcher.matches())
            return true;
        else
            throw new InvalidFirstNameException("Invalid first name");
    }

    public boolean validateLastName(String lastName) throws InvalidLastNameException {
        String nameRegex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(lastName);

        if (matcher.matches())
            return true;
        else
            throw new InvalidLastNameException("Invalid last name");
    }

    public boolean validateEmail(String email) throws InvalidEmailException {
        // String emailRegex = "^[\\w.+%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(\\.[A-Za-z]{2,})?$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches())
            return true;
        else
            throw new InvalidEmailException("Invalid email");
    }

    public boolean validatePhoneNum(String phoneNum) throws InvalidPhoneNumException {
        String numRegex = "[0-9]{2}\\s[0-9]{10}";
        Pattern pattern = Pattern.compile(numRegex);
        Matcher matcher = pattern.matcher(phoneNum);

        if (matcher.matches())
            return true;
        else
            throw new InvalidPhoneNumException("Invalid Phone number");
    }

    public boolean validatePassword(String pass) throws InvalidPasswordException {
        String passRegex = "(^(?=.*[A-Z])(?=.*\\d).(?=.*\\W).*$){8,}";
        Pattern pattern = Pattern.compile(passRegex);
        Matcher matcher = pattern.matcher(pass);

        if (matcher.matches())
            return true;
        else
            throw new InvalidPasswordException("Invalid Password");
    }

}
