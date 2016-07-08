package com.example.qube.to_dolist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Qube on 7/8/16.
 */
public class ToDoItemsAdapter extends RecyclerView.Adapter<ToDoItemsViewHolder> {

    List<ToDoItemsObject> mToDoItemsObjectsList;

    public ToDoItemsAdapter(final List<ToDoItemsObject> toDoItemsObjectList) {
        mToDoItemsObjectsList = toDoItemsObjectList;
    }

    @Override
    public ToDoItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tdi_description,
                parent, false);
        ToDoItemsViewHolder viewHolder = new ToDoItemsViewHolder(parentView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ToDoItemsViewHolder holder, int position) {
        ToDoItemsObject toDoItem = mToDoItemsObjectsList.get(position);
        holder.mToDoItem.setText(toDoItem.getmToDoItem());
        holder.mDescription.setText(toDoItem.getmDescription());

        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {


            }
        };

    }

    @Override
    public int getItemCount() {
        return mToDoItemsObjectsList.size();
    }
}

