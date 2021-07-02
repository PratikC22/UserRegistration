/***********************************************************************
 * This code validates entered user details.
 *
 * @author Pratik Chaudhari
 * @since 28/06/2021
 ***********************************************************************/
package com.pratik.Controller;

import com.pratik.Service.UserRegistrationService;
import com.pratik.Util.UserInputOutput;

public class UserRegistrationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the user registration program");
        UserInputOutput userInputOutput = new UserInputOutput();
        userInputOutput.getMenu();
    }
}
