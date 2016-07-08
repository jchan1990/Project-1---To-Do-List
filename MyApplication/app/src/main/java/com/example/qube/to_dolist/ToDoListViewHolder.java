package com.example.qube.to_dolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Qube on 7/8/16.
 */
public class ToDoListViewHolder extends RecyclerView.ViewHolder {

    public TextView mTitle;
    public LinearLayout mLinearLayout;

    public ToDoListViewHolder(View itemView) {
        super(itemView);
        mTitle = (TextView) itemView.findViewById(R.id.tdlTitleTextView);
        mLinearLayout = (LinearLayout) itemView.findViewById(R.id.tdlLinearLayout);
    }
}
