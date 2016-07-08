package com.example.qube.to_dolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Qube on 7/8/16.
 */
public class ToDoItemsViewHolder extends RecyclerView.ViewHolder {

    public TextView mToDoItem;
    public TextView mDescription;
    public LinearLayout mLinearLayout;

    public ToDoItemsViewHolder(View itemView) {
        super(itemView);
        mToDoItem = (TextView) itemView.findViewById(R.id.tdiTdiTextView);
        mDescription = (TextView) itemView.findViewById(R.id.tdiDescriptionTextView);
        mLinearLayout = (LinearLayout) itemView.findViewById(R.id.tdiLinearLayoutRecyclerView);
    }
}
