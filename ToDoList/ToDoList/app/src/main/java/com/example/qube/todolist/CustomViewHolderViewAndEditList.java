package com.example.qube.todolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Qube on 7/26/16.
 */
public class CustomViewHolderViewAndEditList extends RecyclerView.ViewHolder {
    public TextView mItemName, mDescription;

    public CustomViewHolderViewAndEditList(View itemView) {
        super(itemView);

        mItemName = (TextView) itemView.findViewById(R.id.tv_itemName);
        mDescription = (TextView) itemView.findViewById(R.id.tv_descrip);

    }


}
