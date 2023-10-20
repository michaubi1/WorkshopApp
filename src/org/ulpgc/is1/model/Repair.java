package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private LocalDateTime date;
    private String description;
    private List<Item> items;
    private int effort;
    private Vehicle vehicle;
    private Payment payment;
    private Mechanic mechanic;
    private BreakdownTypes breakdown;
    public int price()
    {
        int price = effort;
        for(Item item : items)
        {
            price += item.getQuantity()*item.getSparePart().getPrice();
        }
        return price;
    }
    public void addItem(SparePart sparePart, int quantity)
    {
        Item item = new Item(quantity, sparePart, this );
        items.add(item);
        sparePart.getItems().add(item);
    }
    public void pay(){
        if (this.payment == null){
            payment = new Payment(this.price());
        }
    }
    public Payment getPayment(){
        return this.payment;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getEffort() {
        return effort;
    }

    public Repair(String description, int effort, BreakdownTypes breakdown, Mechanic mechanic, Vehicle vehicle) {
        this.vehicle = vehicle;
        this.id = ++NEXT_ID;
        this.date = LocalDateTime.now();
        this.description = description;
        this.items = new ArrayList<>();
        this.effort = effort;
        this.breakdown = breakdown;
        this.mechanic = mechanic;
        this.vehicle = vehicle;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    //TODO toString
    @Override
    public String toString()
    {
        String retStr = "Repair ID: "+this.id+
                "\nDate: "+this.date+
                "\nDescription: "+this.description+
                "\neffort: "+this.effort+
                "\nVehicle: "+this.vehicle.toString()+
                "\nMechanic: "+this.mechanic.toString();
        for(Item item: items)
        {
            retStr+="\nPart: "+item.getSparePart().getName()+", Quantity: "+item.getQuantity();
        }
        if(payment!=null)
            retStr+="\nPayment: "+payment.getAmount()+" on date: "+payment.getDate();
        else
            retStr+="\nPayment not completed";
        return retStr;

    }

}

