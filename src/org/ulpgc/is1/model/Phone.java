package org.ulpgc.is1.model;

import javax.swing.*;

public class Phone {
    private String number;

    public boolean isValid() {
        return number.matches("\\+\\d{11,12}|\\d{9}");
    }

    public Phone(String number) {
        this.number = number;
        if(!this.isValid())
            this.number = "XXXX";
    }
    public String getNumber(){return this.number;}

    public void setNumber(String number) {
        this.number = number;
    }
}
