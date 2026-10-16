import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

/***
 * Problem: You are creating a password validation system.
 * A valid password must meet the following requirements:
 * It must contain at least one uppercase letter,
 * It must contain at least one number,
 * It must not contain the word "password" (case insensitive).
 * Write a function that checks if a password is valid and prints "Valid password"
 * or "Invalid password" based on the rules.
 * Expected output: Valid password: false
 */

public class D_PasswordValidator {

    public static void main(String[] args) {
        D_PasswordValidator d = new D_PasswordValidator();
    }

    public D_PasswordValidator() {
        String password = "MyPassw0rd";
        System.out.println("Valid password: " + isValidPassword(password));  // Output: Invalid password (false)
    }

    public boolean isValidPassword(String password) {
        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasPassword = false;
        for(int i=0;i<password.length();i++){
            if(isUpperCase(password.charAt(i))){
                hasUppercase = true;
            }
            if(isDigit(password.charAt(i))){
                hasNumber = true;
            }
            if(i+8<password.length()){
                if(password.substring(i,i+8).equalsIgnoreCase("password")){
                    hasPassword = true;
                }
            }
        }

        return true; // this is a temporary return to avoid errors
    }

}
