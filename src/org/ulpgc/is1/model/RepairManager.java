package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.HashSet;

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

    public void addVehicle(String make, String model, String plate, String owner, String phone){
        vehicles.add(new Vehicle(make, model, new Plate(plate), new Customer(owner, new Phone(phone))));
    }
    public void addVehicle(String make, String model, String plate, Customer owner){
        vehicles.add(new Vehicle(make, model, new Plate(plate), owner));
    }
    private void addAll(Repair repair, Vehicle vehicle, Mechanic mechanic, ArrayList<SparePart> partsList, ArrayList<Integer> partAmount){

        for (int i=0; i<partsList.size(); i++) {
            partsList.get(i).addToRepair(partAmount.get(i), repair);
        }
        vehicle.addRepair(repair);
        mechanic.addRepair(repair);
    }
    public void repair(Integer effort, String description, Mechanic mechanic, Vehicle vehicle, ArrayList<SparePart> partsList, ArrayList<Integer> partAmount, ArrayList<BreakdownTypes> breakdown) {
        Repair repair = new Repair(description, effort, breakdown, mechanic, vehicle);
        addAll(repair, vehicle, mechanic, partsList, partAmount);
    }
    public void repair(Integer effort, String description, Mechanic mechanic, Vehicle vehicle, SparePart part, Integer amount, ArrayList<BreakdownTypes> breakdown) {
        Repair repair = new Repair(description, effort, breakdown, mechanic, vehicle);
        ArrayList<SparePart> partsList = new ArrayList<>();
        partsList.add(part);
        ArrayList<Integer> partAmount = new ArrayList<>();
        partAmount.add(amount);

        addAll(repair, vehicle, mechanic, partsList, partAmount);
    }
    public void repair(Integer effort, String description, Mechanic mechanic, Vehicle vehicle, SparePart part, Integer amount, BreakdownTypes breakdown) {
        ArrayList<BreakdownTypes> breakdowns = new ArrayList<>();
        breakdowns.add(breakdown);
        Repair repair = new Repair(description, effort, breakdowns, mechanic, vehicle);
        ArrayList<SparePart> partsList = new ArrayList<>();
        partsList.add(part);
        ArrayList<Integer> partAmount = new ArrayList<>();
        partAmount.add(amount);

        addAll(repair, vehicle, mechanic, partsList, partAmount);
    }
    public void repair(Integer effort, String description, Mechanic mechanic, Vehicle vehicle, ArrayList<SparePart> partsList, ArrayList<Integer> partAmount, BreakdownTypes breakdown) {
        ArrayList<BreakdownTypes> breakdowns = new ArrayList<>();
        breakdowns.add(breakdown);
        Repair repair = new Repair(description, effort, breakdowns, mechanic, vehicle);

        addAll(repair, vehicle, mechanic, partsList, partAmount);
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

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public ArrayList<SparePart> getSpareParts() {
        return spareParts;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
