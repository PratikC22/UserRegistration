package Util;

import Service.UserRegistrationService;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputOutput {

    Scanner sc = new Scanner(System.in);
    UserRegistrationService user = new UserRegistrationService();

    public void getMenu() {
        System.out.println("Enter your first name :");
        String firstName = sc.nextLine();
        System.out.println(user.usernameValidation(firstName));
        System.out.print("Enter your Last Name : ");
        String lastName = sc.nextLine();
        System.out.println(user.usernameValidation(lastName));
        System.out.print("Enter your email : ");
        String email = sc.nextLine();
        System.out.println(user.emailValidation(email));
        System.out.print("Enter your Mobile Number : ");
        String mNumber = sc.nextLine();
        System.out.println(user.mobileNumValidation(mNumber));
        System.out.print("Enter your Password : ");
        String password = sc.nextLine();
        System.out.println(user.passwordValidation(password));
    }
}
