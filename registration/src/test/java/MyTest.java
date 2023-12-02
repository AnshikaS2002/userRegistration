import org.UserRegistration;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MyTest {

    @Test
    public void testFirstNameHappyCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res1 = userRegistration.validateFirstName("Anshika");
        assertTrue(res1);
    }

    @Test
    public void testFirstNameSadCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res2 = userRegistration.validateFirstName("anshika");
        assertTrue(res2);
    }

    @Test
    public void testLastNameHappyCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res1 = userRegistration.validateLastName("Semwal");
        assertTrue(res1);
    }

    @Test
    public void testLastNameSadCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res2 = userRegistration.validateLastName("Se");
        assertTrue(res2);
    }

    @Test
    public void testEmailHappyCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res1 = userRegistration.validateEmail("abc@gmail.com");
        assertTrue(res1);
    }

    @Test
    public void testEmailSadCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res2 = userRegistration.validateEmail("abcgmail.com");
        assertTrue(res2);
    }

    @Test
    public void testPhoneNumHappyCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res1 = userRegistration.validatePhoneNum("91 9898877652");
        assertTrue(res1);
    }

    @Test
    public void testPhoneNumSadCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res2 = userRegistration.validatePhoneNum("9876987665");
        assertTrue(res2);
    }

    @Test
    public void testPasswordHappyCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res1 = userRegistration.validatePassword("aAc@gmail3com");
        assertTrue(res1);
    }

    @Test
    public void testPasswordSadCase() {
        UserRegistration userRegistration = new UserRegistration();
        boolean res2 = userRegistration.validatePassword("aA#3");
        assertTrue(res2);
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com" })
    public void testValidEmails(String email) {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    })
    public void testInvalidEmails(String email) {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail(email);
        assertTrue(result);
    }

}
