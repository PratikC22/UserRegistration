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
}
