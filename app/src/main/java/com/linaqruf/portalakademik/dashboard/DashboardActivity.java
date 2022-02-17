package com.linaqruf.portalakademik.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.linaqruf.portalakademik.profile.ProfileActivity;
import com.linaqruf.portalakademik.R;
import com.linaqruf.portalakademik.dashboard.agenda.AgendaAdapter;
import com.linaqruf.portalakademik.dashboard.agenda.SetterGetterAgenda;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    RecyclerView recyclerViewMenu;
    RecyclerView recyclerViewAgenda;

    ArrayList<SetterGetter> datamenu;
    ArrayList<SetterGetterAgenda> agenda;
    GridLayoutManager gridLayoutManager;
    LinearLayoutManager linearLayoutManager;
    DashBoardAdapter adapterMenu;
    AgendaAdapter adapterAgenda;
//
    ImageView imgProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerViewMenu        =   findViewById(R.id.rv_menu);
        recyclerViewAgenda        =   findViewById(R.id.rv_agenda);

//      MENU
        addData();
        gridLayoutManager   =   new GridLayoutManager(this, 2);
        recyclerViewMenu.setLayoutManager(gridLayoutManager);
        adapterMenu             =   new DashBoardAdapter(datamenu);
        recyclerViewMenu.setAdapter(adapterMenu);

//      AGENDA
        addAgenda();
        linearLayoutManager   =   new LinearLayoutManager(DashboardActivity.this);
        recyclerViewAgenda.setLayoutManager(linearLayoutManager);
        adapterAgenda             =   new AgendaAdapter(agenda);
        recyclerViewAgenda.setAdapter(adapterAgenda);
//
        imgProfile = findViewById(R.id.imgProfile);
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }

    public void addData(){
        datamenu            =   new ArrayList<>();
        datamenu.add(new SetterGetter(
                "Isian Rencana Semester",
                "logomenu1"));
        datamenu.add(new SetterGetter("Lembar Hasil Semester", "logomenu2"));
        datamenu.add(new SetterGetter("Kerja Praktek", "logomenu3"));
        datamenu.add(new SetterGetter("Tugas Akhir", "logomenu4"));
    }

    private void addAgenda() {
        agenda            =   new ArrayList<>();
        agenda.add(new SetterGetterAgenda(
                "Bahasa Indonesia",
                "07.30-09.00",
                "Ronidin, SS. MA"));
        agenda.add(new SetterGetterAgenda(
                "Pemrograman Teknologi Bergerak",
                "10.10-11.40",
                "Husnil Kamil, MT"));
        agenda.add(new SetterGetterAgenda(
                "Manajemen Basis Data",
                "13.30-15.00",
                "Rahmatika Pratama Santi, MT "));
        agenda.add(new SetterGetterAgenda(
                "Akuisisi Data",
                "16.00 17.40",
                "Fajril Akbar, M.Sc"));



    }

}