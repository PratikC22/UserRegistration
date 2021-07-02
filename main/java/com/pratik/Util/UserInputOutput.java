package com.pratik.Util;

import com.pratik.Model.UserRegistration;
import com.pratik.Service.UserRegistrationService;
import java.util.Scanner;

public class UserInputOutput {

    Scanner sc = new Scanner(System.in);

    public UserRegistration getMenu() {

        UserRegistration user = new UserRegistration();
        UserRegistrationService userService = new UserRegistrationService();

        System.out.println("Enter your first name :");
        user.setFirstName(sc.next());
        userService.usernameValidation(user.getFirstName());

        System.out.print("Enter your Last Name : ");
        user.setLastName(sc.next());
        userService.usernameValidation(user.getLastName());

        System.out.print("Enter your email : ");
        user.setEmailAddress(sc.nextLine());
        userService.emailValidation(user.getEmailAddress());

        System.out.print("Enter your Mobile Number : ");
        user.setMobileNumber(sc.nextLine());
        userService.mobileNumValidation(user.getMobileNumber());

        System.out.print("Enter your Password : ");
        user.setPassword(sc.nextLine());
        userService.passwordValidation(user.getPassword());

        return user;
    }
}
