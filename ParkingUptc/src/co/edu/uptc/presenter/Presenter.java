package co.edu.uptc.presenter;

import javax.swing.JOptionPane;

import co.edu.uptc.model.User;
import co.edu.uptc.model.Vehicle;
import co.edu.uptc.model.ModelSystem;
import co.edu.uptc.model.PasswordValidate;
import co.edu.uptc.model.Schedule;

public final class Presenter {

    private PasswordValidate validatorObject;
    private static Presenter presenter;
    private ModelSystem model;

    public Presenter() {
        validatorObject = new PasswordValidate();
    }

    public boolean handlePasswordChange(String password) {
        return validatorObject.isPasswordValid(password);
    }

    public boolean addParking(String name, String address, int spaces, Schedule[] schedules) {
        model.addParking(name, address, spaces, schedules);
        return true;
    }

    public boolean addUser(String identityDoc, String name, String lastName, String address, String phone,
            String email) {
        model.addUser(identityDoc, name, lastName, address, phone, email);
        return true;
    }

    public static Presenter getInstance() {
        if (presenter == null) {
            presenter = new Presenter();
            System.out.println("Creo instacia presenter!");
        }
        return presenter;
    }
}
