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

    public void addVehicle(String make, String model, String plate, String owner, String phone) throws Exception {
        vehicles.add(new Vehicle(make, model, plate, owner, phone));
    }
    public void repair(Integer effort, String description, Mechanic mechanic, Vehicle vehicle, ArrayList<SparePart> partsList, ArrayList<Integer> partAmount, ArrayList<BreakdownTypes> breakdown) throws Exception {
        Repair repair = new Repair(description, effort, breakdown, mechanic, vehicle);

        for (int i=0; i<=partsList.size(); i++) {
            partsList.get(i).addRepair(partAmount.get(i), repair);
        }
        vehicle.addRepair(repair);
        mechanic.addRepair(repair);
    }
}
