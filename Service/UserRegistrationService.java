package Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationService implements UserRegistrationInterface {
    static Pattern p;

    @Override
    public boolean usernameValidation(String name) {
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }

    @Override
    public boolean emailValidation(String email) {
        String regex = "^[a-z]{3}[a-zA-Z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.][a-z]*$";;
        p = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();
    }
}
