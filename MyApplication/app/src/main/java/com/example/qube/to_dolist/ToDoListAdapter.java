package com.example.qube.to_dolist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Qube on 7/8/16.
 */
public class ToDoListAdapter extends RecyclerView.Adapter<ToDoListViewHolder> {

    List<ToDoListObject> mToDoListObjectsList;

    public ToDoListAdapter(final List<ToDoListObject> toDoListObjectList) {
        mToDoListObjectsList = toDoListObjectList;
    }

    @Override
    public ToDoListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tdl_title,
                parent, false);
        ToDoListViewHolder viewHolder = new ToDoListViewHolder(parentView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ToDoListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
