package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.List;

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private LocalDateTime date;
    private String description;
    private List<Item> items;
    private int effort;

    public int price()
    {
        int price = effort;
        for(Item item : items)
        {
            price += item.getQuantity()*item.getSparePart().getPrice();
        }
        return price;
    }

    public Repair(LocalDateTime date, String description, List<Item> items, int effort) {
        this.id = ++NEXT_ID;
        this.date = date;
        this.description = description;
        this.items = items;
        this.effort = effort;
    }
}

