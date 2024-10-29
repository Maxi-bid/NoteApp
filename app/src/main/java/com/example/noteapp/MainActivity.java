package com.example.noteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nota1;
    Button ingresa, eliminar;
    RecyclerView RecyclerVV;
    RecyclerView.Adapter rAdapter;
    ArrayList<Nota> ListaNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota1 = findViewById(R.id.TxtNota);
        ingresa = findViewById(R.id.btnIngresar);
        eliminar = findViewById(R.id.btnEliminar);
        RecyclerVV = findViewById(R.id.RecyclerV);
        ListaNotas = new ArrayList<Nota>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerVV.setLayoutManager(linearLayoutManager);

    }
        public void addNota(View view) {

        }
    }