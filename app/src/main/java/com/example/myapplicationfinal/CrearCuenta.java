package com.example.myapplicationfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CrearCuenta extends AppCompatActivity {
    RadioButton c1,c2,c3;
    Button siguiente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
        c1=(RadioButton)findViewById(R.id.o1);
        c2=(RadioButton)findViewById(R.id.o2);
        c3=(RadioButton)findViewById(R.id.o3);



        siguiente=(Button)findViewById(R.id.button2);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( CrearCuenta.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void onclick(View view) {
        if (view.getId()==R.id.button2);
        validar();
    }
    public void validar(){
        String cad="Seleccionado: \n";
        if (c1.isChecked()==true) {
            cad += "Opcion1\n";

        }
        if (c2.isChecked()==true){
            cad+="Opcion2\n";

        }
        if (c3.isChecked()==true){

            cad+="Opcion3\n";
        }
        Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_SHORT).show();
    }


}