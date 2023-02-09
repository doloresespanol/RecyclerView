package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList<Produkt> listaZakupow = new LinkedList<>();
    RecyclerView recyclerView;
    ZakupyAdapter adapter;
    private void przygotujListe(){
        listaZakupow.add(new Produkt("mleko"));
        listaZakupow.add(new Produkt("śmietana"));
        listaZakupow.add(new Produkt("chleb"));
        listaZakupow.add(new Produkt("woda"));
        listaZakupow.add(new Produkt("sok"));
        listaZakupow.add(new Produkt("ser"));
        listaZakupow.add(new Produkt("ser"));
        listaZakupow.add(new Produkt("se41"));
        listaZakupow.add(new Produkt("se3r"));
        listaZakupow.add(new Produkt("se1r"));
        listaZakupow.add(new Produkt("se2r"));
        listaZakupow.add(new Produkt("ser"));
        listaZakupow.add(new Produkt("se5r"));
        listaZakupow.add(new Produkt("s7er"));
        listaZakupow.add(new Produkt("ser"));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przygotujListe();
        recyclerView = findViewById(R.id.recycler);
        adapter = new ZakupyAdapter(this,listaZakupow);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.usunZaznaczoneElementy();
            }
        });
    }
}