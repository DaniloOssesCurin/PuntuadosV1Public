package com.example.myapplicationfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class pestania_N3 extends AppCompatActivity {
    Button siguiente;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pestania_n3);

        siguiente=findViewById(R.id.button5);

            spinner=findViewById(R.id.spiner);

            ArrayList<TipoPelicula>tipo=new ArrayList<>();
            tipo.add(new TipoPelicula("1"," Buena"));
            tipo.add(new TipoPelicula("2"," Mala"));
            tipo.add(new TipoPelicula("3"," Pasable"));

            ArrayAdapter<TipoPelicula>adapter=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,tipo);

            spinner.setAdapter(adapter);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(pestania_N3.this,"Realize una accion",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        siguiente=(Button)findViewById(R.id.button4);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( pestania_N3.this, Pestania_N2.class);
                startActivity(i);
            }
        });
        siguiente=(Button)findViewById(R.id.button5);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( pestania_N3.this, Pestania_N2.class);
                startActivity(i);
            }
        });

    }
}