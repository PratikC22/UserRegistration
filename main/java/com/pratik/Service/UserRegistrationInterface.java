package com.pratik.Service;

public interface UserRegistrationInterface {
    public abstract boolean usernameValidation(String name);
    public abstract boolean emailValidation(String email);
    public abstract boolean mobileNumValidation(String mobileNum);
    public abstract boolean passwordValidation(String password);
    public abstract boolean analyseHappySad(String message);
}
