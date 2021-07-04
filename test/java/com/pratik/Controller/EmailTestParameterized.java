package com.pratik.Controller;

import com.pratik.Service.UserRegistrationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTestParameterized {

    private String email;
    private String expected;

    public EmailTestParameterized(String email, String expected) {
        this.email = email;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection emailInput(){
        return Arrays.asList(new Object[][]
                {{"abc@gmail.com",true},
                        {"abc-100@gmail.com",true},
                        {"abc.100@gmail.com",true},
                        {"abc-100@abc.com",true},
                        {"abc-100@abc.net",true},
                        {"abc.100@abc.com.au",true},
                        {"abc@1.com",true},
                        {"abc@gmail.com.com",true},
                        {"abc+100@yahoo.com",true},
                        {"abc@gmail.com.aa.au",false},
                        {"abc@.com.my",false},
                        {"abc123@gmail.a",false},
                        {"abc123@.com",false},
                        {"abc123@.com.com",false},
                        {".abc@abc.com",false},
                        {"abc()*@gmail.com",false},
                        {"abc@%*.com",false},
                        {"abc..2002@gmail.com",false},
                        {"abc.@gmail.com",false},
                        {"abc@abc@gmail.com",false},
                        {"abc@gmail.com.1a",false},});
    }

    @Test
    public void givenProperEmail_returnsTrue() {
        UserRegistrationService userRegistrationService = new UserRegistrationService();
        Assertions.assertEquals(expected,userRegistrationService.emailValidation(email));
    }
}