package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList<String> listaZakupow = new LinkedList<>();
    RecyclerView recyclerView;
    ZakupyAdapter adapter;
    private void przygotujListe(){
        listaZakupow.add("mleko");
        listaZakupow.add("śmietana");
        listaZakupow.add("chleb");
        listaZakupow.add("woda");
        listaZakupow.add("sok");
        listaZakupow.add("ser");
        listaZakupow.add("jajka");
        listaZakupow.add("indyk");
        listaZakupow.add("ryż");
        listaZakupow.add("sól");
        listaZakupow.add("mięso");
        listaZakupow.add("jabłko");
        listaZakupow.add("pomidor");
        listaZakupow.add("sałata");
        listaZakupow.add("por");
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
    }
}