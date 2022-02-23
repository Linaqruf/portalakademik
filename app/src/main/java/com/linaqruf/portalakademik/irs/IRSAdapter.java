package com.linaqruf.portalakademik.irs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.linaqruf.portalakademik.R;


import java.util.ArrayList;

public class IRSAdapter extends RecyclerView.Adapter<IRSAdapter.IRSHolder> {

        private ArrayList<SetterGetterIRS> listdata;

    public IRSAdapter(ArrayList<SetterGetterIRS> listdata) {
            this.listdata           =   listdata;
        }

        @NonNull
        @Override
        public IRSAdapter.IRSHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view              =    LayoutInflater.from(parent.getContext()).inflate(R.layout.item_irs,parent,false);
            IRSAdapter.IRSHolder holder =    new IRSAdapter.IRSHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull IRSAdapter.IRSHolder holder, int position) {

            final SetterGetterIRS getData  =   listdata.get(position);
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

        public class IRSHolder extends RecyclerView.ViewHolder{

            TextView mataKuliahMenu;
            TextView jadwalMenu;
            TextView dosenMenu;

            public IRSHolder(@NonNull View itemView) {
                super(itemView);
                mataKuliahMenu           = itemView.findViewById(R.id.txMatkul);
                jadwalMenu             = itemView.findViewById(R.id.txJadwal);
                dosenMenu             = itemView.findViewById(R.id.txDosenPengampu);

            }

        }



    }
