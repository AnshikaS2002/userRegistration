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
}
