package co.edu.uptc.presenter;

import javax.swing.JOptionPane;

import co.edu.uptc.model.User;
import co.edu.uptc.model.Vehicle;
import co.edu.uptc.model.PasswordValidate;


public final class Presenter {
    

    private PasswordValidate validatorObject;

    public Presenter() {
        validatorObject = new PasswordValidate();
    }

    public boolean handlePasswordChange(String password) {
        return validatorObject.isPasswordValid(password);
    }
}

    // public void onSaveButtonClicked(String id, String password, String repeatPassword) {
    //     if (!password.equals(repeatPassword)) {
    //         view.showMessage("Passwords do not match.");
    //         return;
    //     }
    
    //     if (!isValidPassword(password)) {
    //         view.showMessage("Password must be 8 characters and contain no special characters.");
    //         return;
    //     }
    
    //     // Aquí puedes llamar al modelo para guardar los datos si todo está bien
    //     model.updatePassword(id, password);
    //     view.showMessage("Password changed successfully.");
    // }
    


