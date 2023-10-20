package org.ulpgc.is1.model;

public class Plate {
    private String number;

    public Plate(String number) {
        this.number = number;
    }
    public boolean isValid(){
        return true;
    }

    public String getNumber() {
        return number;
    }
}
