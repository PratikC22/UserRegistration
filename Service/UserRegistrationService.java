package Service;

import java.util.ArrayList;
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
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);

        return m.matches();
    }

    @Override
    public void emailSampleValidation() {
        ArrayList<String> emailList = new ArrayList<>();
        System.out.println("\nValidating sample email :\n");
        //Valid email
        emailList.add("abc@yahoo.com");
        emailList.add("abc-100@yahoo.com");
        emailList.add("abc.100@yahoo.com");
        emailList.add("abc111@abc.com");
        emailList.add("abc-100@abc.net");
        emailList.add("abc.100@abc.com.au");
        emailList.add("abc@1.com");
        emailList.add("abc@gmail.com.com");
        emailList.add("abc+100@gmail.com");

        //Invalid email
        emailList.add("abc");
        emailList.add("abc@.com.my");
        emailList.add("abc123@gmail.a");
        emailList.add("abc123@.com");
        emailList.add("abc123@.com.com");
        emailList.add(".abc@abc.com");
        emailList.add("abc()*@gmail.com");
        emailList.add("abc@%*.com");
        emailList.add("abc..2002@gmail.com");
        emailList.add("abc.@gmail.com");
        emailList.add("abc@abc@gmail.com");
        emailList.add("abc@gmail.com.1a");
        emailList.add("abc@gmail.com.aa.au");


        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9-]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
        Pattern pattern = Pattern.compile(regex);

        for (String email : emailList) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches());
        }
    }
}
