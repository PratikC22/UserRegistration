package Util;

import Service.UserRegistrationService;

import java.util.Scanner;

public class UserInputOutput {

    Scanner sc = new Scanner(System.in);
    UserRegistrationService user = new UserRegistrationService();

    public void getMenu() {
        System.out.println("Enter your first name :");
        String fname = sc.nextLine();
        System.out.println(user.usernameValidation(fname));
        System.out.print("Enter your Last Name : ");
        String lname = sc.nextLine();
        System.out.println(user.usernameValidation(lname));
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
