package br.com.etecia.pontosturisticosapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<> {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class WeViewHolder extends RecyclerView{
        TextView tvNomePaisagem;
        ImageView imgPaisagem;

        CardView cardView;

        public WeViewHolder(@NonNull Context context) {
            super(context);

            tvNomePaisagem = (TextView)
        }
    }
}
