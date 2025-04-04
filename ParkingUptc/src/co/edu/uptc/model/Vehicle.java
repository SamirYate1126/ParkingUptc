package co.edu.uptc.model;

public class Vehicle {
    private String plate;
    private String type;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String type) {
        this.plate = licensePlate;
        this.type = type;
    }

    public String getLicensePlate() {
        return plate;
    }

    public void setLicensePlate(String licensePlate) {
        this.plate = licensePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle [plate=" + plate + ", type=" + type + "]";
    }
}

