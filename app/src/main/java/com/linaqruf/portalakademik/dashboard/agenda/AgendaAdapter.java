package com.linaqruf.portalakademik.dashboard.agenda;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.linaqruf.portalakademik.R;


import java.util.ArrayList;

public class AgendaAdapter extends RecyclerView.Adapter<AgendaAdapter.AgendaHolder> {

    private ArrayList<SetterGetterAgenda> listdata;

    public AgendaAdapter(ArrayList<SetterGetterAgenda> listdata) {
        this.listdata           =   listdata;
    }

    @NonNull
    @Override
    public AgendaAdapter.AgendaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view              =    LayoutInflater.from(parent.getContext()).inflate(R.layout.agenda_dashboard,parent,false);
        AgendaAdapter.AgendaHolder holder =    new AgendaAdapter.AgendaHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AgendaAdapter.AgendaHolder holder, int position) {

        final SetterGetterAgenda getData  =   listdata.get(position);
        String matkulmenu            =   getData.getMataKuliah();
        String jadwalmenu             =   getData.getJadwal();
        String dosenmenu             =   getData.getDosen();

        holder.mataKuliahMenu.setText(matkulmenu);
        holder.jadwalMenu.setText(jadwalmenu);
        holder.dosenMenu.setText(dosenmenu);
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class AgendaHolder extends RecyclerView.ViewHolder{

        TextView mataKuliahMenu;
        TextView jadwalMenu;
        TextView dosenMenu;

        public AgendaHolder(@NonNull View itemView) {
            super(itemView);
            mataKuliahMenu           = itemView.findViewById(R.id.txMatkul);
            jadwalMenu             = itemView.findViewById(R.id.txJadwal);
            dosenMenu             = itemView.findViewById(R.id.txDosenPengampu);

        }

    }



}
