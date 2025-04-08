package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.List;

public class ModelSystem {
    private Parking parking;
    private User2 user;
    private Schedule[] schedule;

    private List<Ticket> tickets;

    public ModelSystem() {
        tickets = new ArrayList<Ticket>();
    }

    public void addParking(String name, String address, int spaces, Schedule[] schedule) {
        this.parking = new Parking(name, address, spaces, schedule);
    }

    public void addUser(String identityDoc,String name, String lastName, String address, String phone, String email) {
        this.user = new User2(identityDoc,name, lastName, address, phone, email);
    }

}
