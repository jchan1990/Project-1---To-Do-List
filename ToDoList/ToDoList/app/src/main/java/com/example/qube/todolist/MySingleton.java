package com.example.qube.todolist;

import java.util.ArrayList;

/**
 * Created by Qube on 7/24/16.
 */
public class MySingleton {
    private static MySingleton toDoLists = null;
    private static ArrayList<CustomObjectLists> listsList;

    private MySingleton() {
        listsList = new ArrayList<>();
    }

    public static MySingleton getInstance() {
        if (toDoLists == null) {
            toDoLists = new MySingleton();
        }
        return toDoLists;
    }

    // add list to the singleton of a list of collection of lists
    public void addList(CustomObjectLists list) {
        listsList.add(list);
    }

    public void removeList(CustomObjectLists list) {
        listsList.remove(list);

    }

    // retrieve a list from collection of lists
    public CustomObjectLists getListByPosition(int position) {
        return listsList.get(position);
    }


    public ArrayList<CustomObjectLists> getListsList() {
        return listsList;
    }

}
