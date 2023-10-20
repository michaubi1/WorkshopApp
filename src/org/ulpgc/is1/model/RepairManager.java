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

    public void addVehicle(String make, String model, String plateNumber, String nameOwner, String numberPhone) {
        vehicles.add(new Vehicle(make, model, new Plate(plateNumber), new Customer(nameOwner, new Phone(numberPhone))));
    }
    public void repair(Integer effort, String description, Mechanic mechanic, Vehicle vehicle, BreakdownTypes breakdown){
        Repair repair = new Repair(description, effort, breakdown, mechanic, vehicle);
        vehicle.getRepairs().add(repair);
        mechanic.getRepairs().add(repair);
    }

    public void addSpareParts(String name, int price) {
        spareParts.add(new SparePart(name, price));
    }

    public Mechanic getMechanic(int i) {
            return mechanics.get(i);
    }

    public Vehicle getVehicle(int i) {
        return vehicles.get(i);
    }
    public SparePart getSparePart(int i)
    {
        return spareParts.get(i);
    }
    public void removeVehicle(int i)
    {
        this.vehicles.remove(i);
    }
    public int countVehicles()
    {
        return vehicles.size();
    }
}
