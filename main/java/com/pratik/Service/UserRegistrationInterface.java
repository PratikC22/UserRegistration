package com.pratik.Service;

public interface UserRegistrationInterface {
    public boolean usernameValidation(String name);
    public boolean emailValidation(String email);
    public boolean mobileNumValidation(String mobileNum);
    public boolean passwordValidation(String password);
    public boolean analyseHappySad(String message);
}
