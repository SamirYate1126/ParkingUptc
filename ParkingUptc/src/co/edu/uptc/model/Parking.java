package co.edu.uptc.model;

import java.util.Arrays;

public class Parking {
private String nameParking;
private String address;
private int availableSpace;
private Schedule[] schedule;
public Parking(){
    
}


public Parking(String nameParking, String address, int availableSpace, Schedule[] schedule) {
    this.nameParking = nameParking;
    this.address = address;
    this.availableSpace = availableSpace;
    this.schedule = schedule;
}
public String getNameParking() {
    return nameParking;
}
public void setNameParking(String nameParking) {
    this.nameParking = nameParking;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public int getAvailableSpace() {
    return availableSpace;
}
public void setAvailableSpace(int availableSpace) {
    this.availableSpace = availableSpace;
}
public Schedule[] getSchedule() {
    return schedule;
}
public void setSchedule(Schedule[] schedule) {
    this.schedule = schedule;
}
@Override
public String toString() {
    return "Parking [nameParking=" + nameParking + ", address=" + address + ", availableSpace=" + availableSpace
            + ", schedule=" + Arrays.toString(schedule) + "]";
}

}
