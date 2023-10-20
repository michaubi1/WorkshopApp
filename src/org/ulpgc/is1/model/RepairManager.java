package org.ulpgc.is1.model;
import java.util.ArrayList;

public class RepairManager {
    private ArrayList<Vehicle> vehicles= new ArrayList<Vehicle>();
    private ArrayList<SparePart> spareparts= new ArrayList<SparePart>();
    private ArrayList<Mechanic> mechanics= new ArrayList<Mechanic>();


    public void addMechcanic(String name, String surname){
        mechanics.add(new Mechanic(name, surname));
    }
    public void addVehicle(String make, String model, String plate){
        //vehicles.add(new Vehicle(make, model, plate));
    }
    public void repair(Integer effort, String description, Mechanic mechanic, Vehicle vehicle, SparePart sparePart, BreakdownTypes breakdown){
        Repair repair = new Repair(description, effort, breakdown, mechanic, vehicle);

        sparePart.addRepair(repair);
        //vehicle.addRepair(repair);
        //Mechanic.addRepair(repair);
    }

}
