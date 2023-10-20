package org.ulpgc.is1.model;

import java.util.List;

public class Mechanic {
    private String name;
    private String surname;
    private List<Repair> repairs;

    public Mechanic(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    //TODO constructor, getters, setters, composition with RepairManager
}
