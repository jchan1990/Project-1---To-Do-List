package com.example.qube.todolist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Toast;

import java.util.List;

/**
 * Created by Qube on 7/25/16.
 */
public class CustomAdapterViewAndEditList extends RecyclerView.Adapter<CustomViewHolderViewAndEditList> {
    List<CustomObjectItems> mItemsList;

    public CustomAdapterViewAndEditList(final List<CustomObjectItems> itemsList) {
        mItemsList = itemsList;
    }

    @Override
    public CustomViewHolderViewAndEditList onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_info, parent, false);
        CustomViewHolderViewAndEditList viewHolderNewList = new CustomViewHolderViewAndEditList(parentView);
        return viewHolderNewList;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderViewAndEditList holder, final int position) {
        holder.mItemName.setText(mItemsList.get(position).getItem());
        holder.mDescription.setText(mItemsList.get(position).getDescription());

        holder.mItemName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "hold item to delete", Toast.LENGTH_SHORT).show();
            }
        });

        holder.mItemName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mItemsList.remove(mItemsList.get(position));
                notifyDataSetChanged();

                return true;
            }
        });
    }


    @Override
    public int getItemCount() {
        if (mItemsList == null) {
            return 0;
        } else {
            return mItemsList.size();
        }
    }
}
