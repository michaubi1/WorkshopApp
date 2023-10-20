package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    private String name;
    private String surname;
    private List<Repair> repairs;

    public Mechanic(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.repairs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }
    @Override
    public String toString()
    {
        return this.name+" "+this.surname;
    }
}
