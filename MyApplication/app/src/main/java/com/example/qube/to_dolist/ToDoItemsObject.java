package com.example.qube.to_dolist;

/**
 * Created by Qube on 7/8/16.
 */
public class ToDoItemsObject {

    String mToDoItem;
    String mDescription;

    // default constructor
    public ToDoItemsObject() {
        mToDoItem = "To Do Item's";
        mDescription = "Description";
    }

    // constructor
    public ToDoItemsObject(String toDoItem, String description) {
        mToDoItem = toDoItem;
        mDescription = description;
    }

    public String getmToDoItem() {
        return mToDoItem;
    }

    public void setmToDoItem(String mToDoItem) {
        this.mToDoItem = mToDoItem;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
