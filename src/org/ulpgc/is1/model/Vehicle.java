package org.ulpgc.is1.model;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class Vehicle {
    private String make;
    private String model;
    private Plate plate;
    private Customer owner;
    private ArrayList<Repair> repairs;

    public Vehicle(String make, String model, Plate plate, Customer owner) {
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.owner = owner;
        this.repairs = new ArrayList<>();
    }
    @Override
    public String toString()
    {
        return "make: "+this.make+"\nmodel: "+this.model+"\nplate: "+this.plate.getNumber()+"\nowner: "+this.owner.getName();
    }

    public ArrayList<Repair> getRepairs() {
        return repairs;
    }

    public void addRepair(Repair repair) {
        repairs.add(repair);
    }
    public Customer getOwner() {return this.owner;}
}
