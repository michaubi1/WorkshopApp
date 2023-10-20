package org.ulpgc.is1.control;
import org.ulpgc.is1.model.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    RepairManager repairManager = new RepairManager();
    init(repairManager);
    System.out.println("Mechanic: "+repairManager.getMechanic(0).getName()+" "+repairManager.getMechanic(0).getSurname());
    System.out.println("Vehicle:\n"+repairManager.getVehicle(1).toString());
    repairManager.repair(100, "Quick Repair",repairManager.getMechanic(0), repairManager.getVehicle(1),BreakdownTypes.mechanical);
    repairManager.getVehicle(1).getRepairs().get(0).addItem(repairManager.getSparePart(0),1); //Adding spare parts I dont know how to add two spare parts in the constructor
    repairManager.getVehicle(1).getRepairs().get(0).addItem(repairManager.getSparePart(1),1); //Adding spare parts
    repairManager.getMechanic(0).getRepairs().get(0).pay(); //paying
    repairManager.removeVehicle(0);
    System.out.println("Number of Vehicles: "+repairManager.countVehicles());
    System.out.println(repairManager.getMechanic(0).getRepairs().get(0).toString());
    }
    private static void init(RepairManager repairManager)
    {
        repairManager.addMechanic("Jan", "Kowalski");
        repairManager.addMechanic("Carlos", "Suarez");
        repairManager.addVehicle("Toyota", "Yaris", "GC97614", "Jose", "980123456");
        repairManager.addVehicle("Toyota", "Hilux", "GC89272", "Antonio", "123");
        repairManager.addSpareParts("Wheel", 200);
        repairManager.addSpareParts("Engine", 3000);
    }

}