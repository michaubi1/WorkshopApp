package org.ulpgc.is1.model;

import java.util.List;

public class Customer {
    private String name;
    private Phone phone;
    List<Vehicle> vehicles;

    public Customer(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }
    public Phone getPhone(){return this.phone;}
}
