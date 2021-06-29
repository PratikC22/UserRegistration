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
    }
}
