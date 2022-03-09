package com.linaqruf.portalakademik.irs.detailIRS;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.linaqruf.portalakademik.R;
import com.linaqruf.portalakademik.irs.SetterGetterIRS;

import java.util.ArrayList;

public class DetaiIRSAdapter extends RecyclerView.Adapter<DetaiIRSAdapter.DetailIRSHolder> {

        private ArrayList<SetterGetterIRSdetail> listdata;

    public DetaiIRSAdapter(ArrayList<SetterGetterIRSdetail> listdata) {
            this.listdata           =   listdata;
        }

        @NonNull
        @Override
        public DetailIRSHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view              =    LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detailirs,parent,false);
            DetailIRSHolder holder =    new DetailIRSHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull DetailIRSHolder holder, int position) {

            final SetterGetterIRSdetail getData  =   listdata.get(position);
            String mingguKe            =   getData.getMingguKe();
            String detail             =   getData.getDetail();


            holder.mingguKeMenu.setText(mingguKe);
            holder.detailMenu.setText(detail);
        }

        @Override
        public int getItemCount() {
            return listdata.size();
        }

        public class DetailIRSHolder extends RecyclerView.ViewHolder{

            TextView mingguKeMenu;
            TextView detailMenu;

            public DetailIRSHolder(@NonNull View itemView) {
                super(itemView);
                mingguKeMenu           = itemView.findViewById(R.id.txMingguKe);
                detailMenu             = itemView.findViewById(R.id.txDetail);


            }

        }



    }
