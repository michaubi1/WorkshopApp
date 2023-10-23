package org.ulpgc.is1.model;

import java.util.HashMap;

public class SparePart {
    private String name;
    private int price;
    private HashMap<Integer, Integer> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HashMap<Integer, Integer> getItems() {
        return items;
    }

    public void addRepair(Integer quantity, Repair repair) {
        Item item = new Item(quantity, this, repair );
        items.put(repair.getId(), quantity);
        repair.getItems().add(item);

    }

    public SparePart(String name, int price) {
        this.name = name;
        this.price = price;
        this.items = new HashMap<Integer, Integer>();
    }
}
