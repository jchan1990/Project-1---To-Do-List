package com.example.qube.todolist;

import java.util.ArrayList;

/**
 * Created by Qube on 7/24/16.
 */
public class CustomObjectLists {

    String mTitle;
    ArrayList<CustomObjectItems> mItemList;

    public CustomObjectLists() {
        mTitle = "Title";
    }

    // when instantiated it will be given an empty list
    public CustomObjectLists(String title) {
        mTitle = title;
        mItemList = new ArrayList();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void addItem(CustomObjectItems item) {
        mItemList.add(item);


    }

    public void removeItem(CustomObjectItems item) {
        mItemList.remove(item);
    }

    public ArrayList<CustomObjectItems> getItemList() {
        return mItemList;
    }

}
