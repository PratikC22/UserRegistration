package Service;

import java.util.ArrayList;

public interface UserRegistrationInterface {
    public boolean usernameValidation(String name);
    public boolean emailValidation(String email);
    public boolean mobileNumValidation(String mobileNum);
    public boolean passwordValidation(String password);
    public void emailSampleValidation();
}
