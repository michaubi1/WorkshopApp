package org.ulpgc.is1.model;

import java.util.List;

public class Customer {
    private String name;
    private Phone phone;
    List<Vehicle> vehicles;
    public Customer(String name, String number, Vehicle vehicle) throws Exception {
        this.name=name;
        this.phone = new Phone(number);
        this.vehicles.add(vehicle);
    }
    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
}
