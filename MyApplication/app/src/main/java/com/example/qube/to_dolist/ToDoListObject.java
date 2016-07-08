package com.example.qube.to_dolist;

/**
 * Created by Qube on 7/8/16.
 */
public class ToDoListObject {

    String mTitle;

    // default constructor
    public ToDoListObject() {
        mTitle = "Title";
    }

    // constructor
    public ToDoListObject(String title) {
        mTitle = title;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
