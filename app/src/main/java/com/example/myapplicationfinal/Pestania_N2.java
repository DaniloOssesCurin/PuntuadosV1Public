package com.example.myapplicationfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.hardware.lights.LightState;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.myapplicationfinal.adapter.RecyclerAdapter;
import com.example.myapplicationfinal.model.ItemList;

import java.util.ArrayList;
import java.util.List;

public class Pestania_N2 extends AppCompatActivity {
    private RecyclerView rvLista;
    private RecyclerAdapter adapter;
    private List<ItemList>items;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pestania_n2);
        initView();
        initValues();
        siguiente=(Button)findViewById(R.id.button3);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Pestania_N2.this, pestania_N3.class);
                startActivity(i);
            }
        });
        siguiente=(Button)findViewById(R.id.button6);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( Pestania_N2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
    private void initView(){
        rvLista=findViewById(R.id.rvLista);


    }
    private void initValues(){

        LinearLayoutManager manager=new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items=getItems();
        adapter=new RecyclerAdapter(items);
        rvLista.setAdapter(adapter);
    }
    private List<ItemList>getItems(){
        List<ItemList>itemLists=new ArrayList<>();
        itemLists.add(new ItemList("Avengers","Vengadores unidos",R.drawable.avengers));
        itemLists.add(new ItemList("Avengers","Vengadores unidos",R.drawable.avengers));
        itemLists.add(new ItemList("Avengers","Vengadores unidos",R.drawable.avengers));
        itemLists.add(new ItemList("Avengers","Vengadores unidos",R.drawable.avengers));
        return itemLists;

    }

}
