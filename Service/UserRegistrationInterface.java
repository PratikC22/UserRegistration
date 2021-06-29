package Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface UserRegistrationInterface {
    public boolean usernameValidation(String name);
    public boolean emailValidation(String email);
}
