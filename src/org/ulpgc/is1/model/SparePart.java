package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SparePart {
    private String name;
    private int price;
    private List<Item> items;

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

    public void addToRepair(int quantity, Repair repair)
    {
        Item item = new Item(quantity, this, repair);
        items.add(item);
        boolean flag = false;
        for(Item element: repair.getItems())
        {
            if(item.getSparePart()==element.getSparePart())
            {
                element.setQuantity(element.getQuantity()+quantity);
                flag = true;
                break;
            }

        }
        if(!flag)
            repair.getItems().add(item);
    }

    public List<Item> getItems() {
        return items;
    }


    public SparePart(String name, int price) {
        this.name = name;
        this.price = price;
        this.items = new ArrayList<>();
    }
}