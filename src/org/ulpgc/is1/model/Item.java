package org.ulpgc.is1.model;

public class Item {
    //TODO research paired relations, rework item
    private int quantity;
    private SparePart sparePart;
    private Repair repair;

    public int getQuantity() {
        return quantity;
    }

    public SparePart getSparePart() {
        return sparePart;
    }

    public Repair getRepair() {
        return repair;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(int quantity, SparePart sparePart, Repair repair) {
        this.quantity = quantity;
        this.sparePart = sparePart;
        this.repair = repair;
    }
}
