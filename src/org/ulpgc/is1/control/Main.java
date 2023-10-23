package org.ulpgc.is1.control;
import org.ulpgc.is1.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RepairManager repairManager = new RepairManager();
        init(repairManager);
        System.out.println("Mechanic: "+repairManager.getMechanic(0).getName()+" "+repairManager.getMechanic(0).getSurname());
        System.out.println("Vehicle:\n"+repairManager.getVehicle(1).toString());
        ArrayList<SparePart> partsToAdd= new ArrayList<>();
        partsToAdd.add(repairManager.getSparePart(0));
        partsToAdd.add(repairManager.getSparePart(1));
        ArrayList<Integer> quantities = new ArrayList<>();
        quantities.add(1);
        quantities.add(1);
        repairManager.repair(100, "Quick Repair", repairManager.getMechanic(0), repairManager.getVehicle(1), partsToAdd, quantities, BreakdownTypes.mechanical);
        repairManager.getMechanic(0).getRepairs().get(0).pay(); //paying
        repairManager.removeVehicle(0);
        System.out.println("Number of Vehicles: "+repairManager.countVehicles());
        System.out.println(repairManager.getMechanic(0).getRepairs().get(0).toString());
    }
    private static void init(RepairManager repairManager)
    {
        repairManager.addMechanic("Jan", "Kowalski");
        repairManager.addMechanic("Carlos", "Suarez");
        repairManager.addVehicle("Toyota", "Yaris", "4321 GHJ", "Jose", "980123456");
        repairManager.addVehicle("Toyota", "Hilux", "8976 DFG", "Antonio", "123");
        repairManager.addSpareParts("Wheel", 200);
        repairManager.addSpareParts("Engine", 3000);
    }
}
