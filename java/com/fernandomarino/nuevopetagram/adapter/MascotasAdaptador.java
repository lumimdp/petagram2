package com.fernandomarino.nuevopetagram.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fernandomarino.nuevopetagram.pojo.Mascotas;
import com.fernandomarino.nuevopetagram.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotasViewHolder> {
    ArrayList<Mascotas> mascotas;

    public MascotasAdaptador(ArrayList<Mascotas> mascotas){
        this.mascotas = mascotas;
    }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);

        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder mascotasViewHolder, int position) {
        Mascotas mascota = mascotas.get(position);
        mascotasViewHolder.fotoMascota.setImageResource(mascota.getFoto());
        mascotasViewHolder.tvNombreMascotaCV.setText(mascota.getNombre());
        mascotasViewHolder.tvVisitasCV.setText(mascota.getVisitas());
        mascotasViewHolder.imgHuesear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Hueseaste a " + mascota.getNombre(), Snackbar.LENGTH_LONG).show();
            }
        });

    }




    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{

        private ImageView fotoMascota;
        private TextView tvNombreMascotaCV;
        private TextView tvVisitasCV;
        private ImageButton imgHuesear;

        public MascotasViewHolder(View itemView) {
            super(itemView);

            fotoMascota        = (ImageView) itemView.findViewById(R.id.fotoMascota);
            tvNombreMascotaCV  = (TextView) itemView.findViewById(R.id.tvNombreMascotaCV);
            tvVisitasCV        = (TextView) itemView.findViewById(R.id.tvVisitasCV);
            imgHuesear         = (ImageButton) itemView.findViewById(R.id.imgHuesear);

        }
    }
}
