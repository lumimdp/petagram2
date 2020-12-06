package com.fernandomarino.nuevopetagram.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fernandomarino.nuevopetagram.R;
import com.fernandomarino.nuevopetagram.adapter.MascotasAdaptador;
import com.fernandomarino.nuevopetagram.pojo.Mascotas;

import java.util.ArrayList;


public class ReciclerWiev extends Fragment {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recicler_wiev, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.reciclerViewActivityMain);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        iniciarListaMascotas();
        iniciarAdaptador();

        return v;
    }
    public void iniciarAdaptador() {
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaMascotas() {

        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas(R.drawable.p1, "Charlie", "2"));
        mascotas.add(new Mascotas(R.drawable.p2, "Lolita", "4"));
        mascotas.add(new Mascotas(R.drawable.p3,"Gaston", "3"));
        mascotas.add(new Mascotas(R.drawable.p4, "Catalina", "5"));
        mascotas.add(new Mascotas(R.drawable.p5, "Rodolfo", "1"));
    }
}