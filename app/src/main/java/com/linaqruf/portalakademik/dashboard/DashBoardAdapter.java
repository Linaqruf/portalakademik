package com.linaqruf.portalakademik.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.linaqruf.portalakademik.R;

import java.util.ArrayList;

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.DashBoardHolder> {

    private ArrayList<SetterGetter> listdata;

    public DashBoardAdapter(ArrayList<SetterGetter> listdata) {
        this.listdata           =   listdata;
    }

    @NonNull
    @Override
    public DashBoardAdapter.DashBoardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view              =    LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard,parent,false);
        DashBoardHolder holder =    new DashBoardHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashBoardAdapter.DashBoardHolder holder, int position) {

        final SetterGetter getData  =   listdata.get(position);
        String titlemenu            =   getData.getTitle();
        String logomenu             =   getData.getImg();

        holder.titleMenu.setText(titlemenu);
        if(logomenu.equals("logomenu1")){
            holder.imgMenu.setImageResource(R.drawable.user);
        }else if(logomenu.equals("logomenu2")){
            holder.imgMenu.setImageResource(R.drawable.user);
        }else if(logomenu.equals("logomenu3")){
            holder.imgMenu.setImageResource(R.drawable.user);
        }else if(logomenu.equals("logomenu4")){
            holder.imgMenu.setImageResource(R.drawable.user);
        }
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DashBoardHolder extends RecyclerView.ViewHolder{

        TextView titleMenu;
        ImageView imgMenu;

        public DashBoardHolder(@NonNull View itemView) {
            super(itemView);
            titleMenu           = itemView.findViewById(R.id.iv_title_menu);
            imgMenu             = itemView.findViewById(R.id.iv_logo_menu);

        }

    }



}
