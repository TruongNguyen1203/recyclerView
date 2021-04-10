package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Item> listItem;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        listItem = new ArrayList<>();
        listItem.add(new Item("ListView trong Android","blabla",R.drawable.android,"Android"));
        listItem.add(new Item("Xử lý sự kiện trong IOS","blabla",R.drawable.ios,"IOS"));
        itemAdapter = new ItemAdapter(getApplicationContext(),listItem);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemTouchHelper itemTouchHelper = new
                ItemTouchHelper(new SwipeToDeleteCallback(itemAdapter,this));
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }


}
