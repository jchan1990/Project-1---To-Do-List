package com.example.qube.todolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Qube on 7/25/16.
 */
public class CustomViewHolderMain extends RecyclerView.ViewHolder {

    public TextView mMainTitle, mListTitle;


    public CustomViewHolderMain(View itemView) {
        super(itemView);

        mMainTitle = (TextView) itemView.findViewById(R.id.tv_main);
        mListTitle = (TextView) itemView.findViewById(R.id.tv_mainListTitle);

    }
}
