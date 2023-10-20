package org.ulpgc.is1.model;

import java.util.ArrayList;

public class RepairManager {
    ArrayList<Mechanic> mechanics;
    ArrayList<SparePart> spareParts;
    ArrayList<Vehicle> vehicles;
    public void addMechanic(String name, String surname)
    {
        mechanics.add(new Mechanic(name, surname));
    }
    public RepairManager() {
        this.mechanics = new ArrayList<>();
        this.spareParts = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(String make, String model, Plate plate, Customer owner) {
        vehicles.add(new Vehicle(make, model, plate, owner));
    }
    public void repair(Integer effort, String description, Mechanic mechanic, Vehicle vehicle, SparePart sparePart, BreakdownTypes breakdown){
        Repair repair = new Repair(description, effort, breakdown, mechanic, vehicle);

        sparePart.addRepair(repair);
        //vehicle.addRepair(repair);
        //Mechanic.addRepair(repair);
    }
}
