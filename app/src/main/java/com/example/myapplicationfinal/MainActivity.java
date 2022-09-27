package com.example.myapplicationfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Button siguiente;
    ProgressBar pb;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prog();

        siguiente=(Button)findViewById(R.id.button2);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( MainActivity.this, CrearCuenta.class);
                startActivity(i);
            }
        });
        siguiente=(Button)findViewById(R.id.button);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( MainActivity.this, Pestania_N2.class);
                startActivity(i);
            }
        });

    }

    private void prog() {

            pb=(ProgressBar)findViewById(R.id.Pro);
            Timer t=new Timer();
            TimerTask tt=new TimerTask() {
                @Override
                public void run() {
                    counter++;
                    pb.setProgress(counter);
                    if (counter==100){

                        t.cancel();
                    }
                }
            };
            t.schedule(tt,0,100);
        }
    }
