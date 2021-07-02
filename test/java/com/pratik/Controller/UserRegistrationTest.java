package com.pratik.Controller;

import com.pratik.Service.UserRegistrationInterface;
import com.pratik.Service.UserRegistrationService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    UserRegistrationService userRegistrationService = new UserRegistrationService();

    @Test
    void givenFirstName_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.usernameValidation("Pratik");
        assertTrue(result);
    }
    @Test
    void givenFirstName_Proper_ShouldReturnFalse() {
        boolean result = userRegistrationService.usernameValidation("pratik");
        assertFalse(result);
    }
    @Test
    void givenLastName_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.usernameValidation("Chaudhari");
        assertTrue(result);
    }
    @Test
    void givenLastName_Proper_ShouldReturnFalse() {
        boolean result = userRegistrationService.usernameValidation("chaudhari");
        assertFalse(result);
    }

    @Test
    void givenEmail_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.emailValidation("abc.xyz@bl.co.in");
        assertTrue(result);
    }
    @Test
    void givenEmail_Proper_ShouldReturnFalse() {
        boolean result = userRegistrationService.emailValidation("abc1020@bridgelabz.co.in");
        assertFalse(result);
    }
    @Test
    void givenMobileNumber_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.mobileNumValidation("91 9657586962");
        assertTrue(result);
    }
    @Test
    void givenMobileNumber_Proper_ShouldReturnFalse() {
        boolean result = userRegistrationService.mobileNumValidation("9196575869");
        assertFalse(result);
    }
    @Test
    void givenPassword_Proper_ShouldReturnTrue() {
        boolean result = userRegistrationService.passwordValidation("Pratik@123");
        assertTrue(result);
    }
    @Test
    void givenPassword_Proper_ShouldReturnFalse() {
        boolean result = userRegistrationService.passwordValidation("pratik@123");
        assertFalse(result);
    }
    @Test
    public void givenSadMessageReturnSad()
    {
        UserRegistrationInterface Analyser = new UserRegistrationService();
        boolean mood = Analyser.analyseHappySad("Hello, I am Sad");
        assertTrue(mood);
    }
    @Test
    public void givenHappyMessageReturnHappy()
    {
        UserRegistrationInterface Analyser = new UserRegistrationService();
        boolean mood = Analyser.analyseHappySad("Hello, I am happy");
        assertTrue(mood);
    }
}