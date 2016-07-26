package com.example.qube.todolist;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Qube on 7/25/16.
 */
public class CustomAdapterMain extends RecyclerView.Adapter<CustomViewHolderMain> {
    List<CustomObjectLists> mListsList;
    private EditText mTitleInput;
    MySingleton lists = MySingleton.getInstance();

    public CustomAdapterMain(final List<CustomObjectLists> listsList) {
        mListsList = listsList;
    }

    @Override
    public CustomViewHolderMain onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_list_title, parent, false);
        //changed R.layout.custom... to a custom xml with just the textview, upon exiting dialog box,
        CustomViewHolderMain viewHolderMain = new CustomViewHolderMain(parentView);
        return viewHolderMain;
    }

    @Override
    // set the list title to the input
    public void onBindViewHolder(CustomViewHolderMain holder, final int position) {
        // holder.mMainTitle.setText() set to the input from the dialog box
        holder.mListTitle.setText(lists.getListsList().get(position).getTitle());

        holder.mListTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Hold to delete *Pika*", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(view.getContext(), EditListActivity.class);
                intent.putExtra(EditListActivity.KEY, position);
                view.getContext().startActivity(intent);
            }
        });

        holder.mListTitle.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                lists.removeList(lists.getListByPosition(position));
                notifyDataSetChanged();
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        if (mListsList == null) {
            return 0;
        } else {
            return mListsList.size();
        }
    }


}
