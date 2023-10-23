package org.ulpgc.is1.model;

import javax.swing.*;

public class Phone {
    private String number;

    public boolean isValid() {
        return number.matches("\\+\\d{11,12}|\\d{9}");
    }

    public Phone(String number) throws Exception{
        this.number = number;
        if (!this.isValid()) {throw new Exception("invalid phone number");}

    }
}
