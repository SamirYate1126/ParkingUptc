package co.edu.uptc.model;

public class PasswordValidate {
    public boolean isPasswordValid(String password) {
        return password.matches("^[a-zA-Z0-9]{8}$");
    }
}
