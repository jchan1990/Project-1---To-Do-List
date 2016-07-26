package com.example.qube.todolist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Qube on 7/25/16.
 */
public class EditListActivity extends AppCompatActivity {

    RecyclerView mRecyclerViewNewList;
    MySingleton lists = MySingleton.getInstance();
    public static final String KEY = "key";
    EditText editTextItem, editTextDescription;
    TextView mListTitle;
    CustomObjectLists mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_edit_list);

        mListTitle = (TextView) findViewById(R.id.tv_mainListTitle);

        mRecyclerViewNewList = (RecyclerView) findViewById(R.id.rv_newList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerViewNewList.setLayoutManager(linearLayoutManager);
        editTextItem = (EditText) findViewById(R.id.et_item);
        editTextDescription = (EditText) findViewById(R.id.et_description);

        // set the adapter
        final int position = getIntent().getIntExtra(KEY, -1);
        final CustomAdapterViewAndEditList adapter = new CustomAdapterViewAndEditList(lists.getListByPosition(position).getItemList());
        mRecyclerViewNewList.setAdapter(adapter);

        if (position >= 0) {
            mList = lists.getListByPosition(position);
            mListTitle.setText(mList.getTitle());
        }


        FloatingActionButton mFab2 = (FloatingActionButton) findViewById(R.id.fab_newList);
        mFab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "*Pika!*", Toast.LENGTH_LONG).show();
                CustomObjectItems item = new CustomObjectItems(editTextItem.getText().toString(), editTextDescription.getText().toString());

                CustomObjectLists currentList = lists.getListByPosition(position);
                currentList.addItem(item);
                adapter.notifyDataSetChanged();

                // clear EditText after adding an item
                editTextDescription.setText("");
                editTextItem.setText("");


            }
        });


    }

}
