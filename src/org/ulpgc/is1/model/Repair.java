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

    public Repair(LocalDateTime date, String description, int effort, Vehicle vehicle) {
        this.vehicle = vehicle;
        this.id = ++NEXT_ID;
        this.date = date;
        this.description = description;
        this.items = new ArrayList<>();
        this.effort = effort;
    }
    //TODO add BreakdownType
}

