package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView(){

        ArrayAdapter<Inmueble> adapter= new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv= findViewById(R.id.milista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos(){

        lista.add(new Inmueble(R.drawable.img1,"Juana Koslay", 120000));

        lista.add(new Inmueble(R.drawable.img2,"Potrero de Los Funes", 950000));
        lista.add(new Inmueble(R.drawable.img3,"El Trapiche", 80000));
    }
}
