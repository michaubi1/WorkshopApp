package org.ulpgc.is1.control;
import org.ulpgc.is1.model.*;

public class Main {
    public static void main(String[] args) {
    RepairManager repairManager = new RepairManager();

    }
    private static void init(RepairManager repairManager)
    {
        repairManager.addMechanic("Jan", "Kowalski");
        repairManager.addMechanic("Carlos", "Suarez");
        repairManager.addVehicle("Toyota", "Yaris", "plateTBD", "", 46636733);

    }
}
