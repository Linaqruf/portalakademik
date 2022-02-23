package com.linaqruf.portalakademik.ihs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.linaqruf.portalakademik.R;


import java.util.ArrayList;

public class IHSAdapter extends RecyclerView.Adapter<IHSAdapter.IHSHolder> {

    private ArrayList<SetterGetterIHS> listdata;

    public IHSAdapter(ArrayList<SetterGetterIHS> listdata) {
        this.listdata           =   listdata;
    }

    @NonNull
    @Override
    public IHSAdapter.IHSHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view              =    LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ihs,parent,false);
        IHSAdapter.IHSHolder holder =    new IHSAdapter.IHSHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull IHSAdapter.IHSHolder holder, int position) {

        final SetterGetterIHS getData  =   listdata.get(position);
        String kodematkulmenu            =   getData.getKodematkul();
        String matkulmenu             =   getData.getMatkul();
        String nilaimenu             =   getData.getNilai();

        holder.kodematkulMenu.setText(kodematkulmenu);
        holder.matkulMenu.setText(matkulmenu);
        holder.nilaiMenu.setText(nilaimenu);
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class IHSHolder extends RecyclerView.ViewHolder{

        TextView kodematkulMenu;
        TextView matkulMenu;
        TextView nilaiMenu;

        public IHSHolder(@NonNull View itemView) {
            super(itemView);
            kodematkulMenu           = itemView.findViewById(R.id.txKodeMatkul);
            matkulMenu             = itemView.findViewById(R.id.txMatkul);
            nilaiMenu             = itemView.findViewById(R.id.txNilai);

        }

    }



}
