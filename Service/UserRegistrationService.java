package Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationService implements UserRegistrationInterface {

    @Override
    public boolean usernameValidation(String name) {
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p;
        p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }

    @Override
    public boolean emailValidation(String email) {
        String regex = "^[a-z]{3}[a-zA-Z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.][a-z]*$";
        ;
        Pattern p;
        p = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();
    }

    @Override
    public boolean mobileNumValidation(String mobileNum) {
        String mobileNumber = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(mobileNumber);
        if (mobileNumber == null) {
            return false;
        }
        Matcher m = p.matcher(mobileNum);

        return m.matches();
    }

    @Override
    public boolean passwordValidation(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);

        return m.matches();
    }
}
