package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Mechanic {
    private String name;
    private String surname;
    private ArrayList<Repair> repairs = new ArrayList<Repair>();

    public Mechanic(String name, String surname) {
        this.name=name;
        this.surname=surname;

    }
    public void addRepair(Repair repair){
        repairs.add(repair);
    }

    //TODO constructor, getters, setters, composition with RepairManager
}
