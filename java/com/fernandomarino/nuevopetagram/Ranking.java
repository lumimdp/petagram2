package com.fernandomarino.nuevopetagram;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fernandomarino.nuevopetagram.adapter.MascotasAdaptador;
import com.fernandomarino.nuevopetagram.pojo.Mascotas;

import java.util.ArrayList;

public class Ranking extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setIcon(R.mipmap.pataperro);
        ab.setDisplayShowHomeEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.reciclerViewActivityRanking);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        iniciarListaMascotas();
        iniciarAdaptador();
    }

    public void iniciarAdaptador() {
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaMascotas() {

        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas(R.drawable.p4, "Catalina", "5"));
        mascotas.add(new Mascotas(R.drawable.p2, "Lolita", "4"));
        mascotas.add(new Mascotas(R.drawable.p3,"Gaston", "3"));
        mascotas.add(new Mascotas(R.drawable.p1, "Charlie", "2"));
        mascotas.add(new Mascotas(R.drawable.p5, "Rodolfo", "1"));
    }



    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }

}