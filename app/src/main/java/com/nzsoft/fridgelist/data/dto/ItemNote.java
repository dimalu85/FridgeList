package com.nzsoft.fridgelist.data.dto;

/**
 * Created by Малусевич on 14.01.2015.
 */
public class ItemNote extends ItemListObject {

    private String comment;

    public ItemNote(int id, Item item, double count) {
        super(id, item, count);
    }

    public ItemNote(Item item, double count) {
        super(item, count);
    }

    public ItemNote(Item item) {
        super(item);
    }

    public ItemNote(int id, Item item, double count, String comment) {
        super(id, item, count);
        setComment(comment);
    }

    public ItemNote(Item item, double count, String comment) {
        super(item, count);
        setComment(comment);
    }

    public ItemNote(Item item, String comment) {
        super(item);
        setComment(comment);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
