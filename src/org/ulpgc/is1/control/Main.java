package org.ulpgc.is1.control;
import org.ulpgc.is1.model.*;

public class Main {
    public static void main(String[] args) {
    RepairManager repairManager = new RepairManager();

    }
    private static void init(RepairManager repairManager) throws Exception {
        repairManager.addMechanic("Jan", "Kowalski");
        repairManager.addMechanic("Carlos", "Suarez");
        repairManager.addVehicle("Toyota", "Yaris", "plateTBD", "Federico Reyes", "46636733");

    }
}
