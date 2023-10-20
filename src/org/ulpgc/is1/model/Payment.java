package org.ulpgc.is1.model;

import java.time.LocalDateTime;

public class Payment {
    private LocalDateTime date;
    private int amount;
    public Payment(int amount){
        this.date=LocalDateTime.now();
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
