package com.nzsoft.fridgelist.data.dto;

/**
 * Created by Малусевич on 14.01.2015.
 */
public class ItemListObject implements ItemList {
    private static final int ID_NAN = 0;
    private static final double COUNT_NAN = 1;

    private int id;
    private Item item;
    private double count;

    public ItemListObject() {
    }

    public ItemListObject(int id, Item item, double count) {
        this.id = id;
        this.item = item;
        this.count = count;
    }

    public ItemListObject(Item item, double count) {
        this.id = ID_NAN;
        this.item = item;
        this.count = count;
    }

    public ItemListObject(Item item) {
        this.id = ID_NAN;
        this.item = item;
        this.count = COUNT_NAN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemListObject)) return false;

        ItemListObject that = (ItemListObject) o;

        if (!item.equals(that.item)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return item.hashCode();
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
