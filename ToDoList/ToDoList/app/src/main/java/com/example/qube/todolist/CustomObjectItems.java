package com.example.qube.todolist;

/**
 * Created by Qube on 7/24/16.
 */
public class CustomObjectItems {
    String mItem, mDescription;

    // default constructor
    public CustomObjectItems() {
        mItem = "Item";
        mDescription = "Description";
    }

    // constructor
    public CustomObjectItems(String item, String description) {
        mItem = item;
        mDescription = description;
    }

    public String getItem() {
        return mItem;
    }


    public String getDescription() {
        return mDescription;
    }

    public void setItem(String item) {
        mItem = item;
    }

    public void setmDescription(String description) {
        mDescription = description;
    }
}
