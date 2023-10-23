package org.ulpgc.is1.model;

public class Plate {
    private String number;

    public Plate(String number) {
        this.number = number;
        if (!this.isValid())
            this.number = "XXXX";
    }
    //using format nnnn LLL
    public boolean isValid(){
        return number.matches("\\d{4} [A-Z]{3}");
    }
    public String getNumber() {
        return number;
    }
}
