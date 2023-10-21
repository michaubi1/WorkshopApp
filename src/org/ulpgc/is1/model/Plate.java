package org.ulpgc.is1.model;

public class Plate {
    private String number;
    public plate(String number){
        if (this.isvalid(number)){
            this.number=number;
        }

    }
}
