package com.linaqruf.portalakademik.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.linaqruf.portalakademik.LoginActivity;
import com.linaqruf.portalakademik.ihs.IHSActivity;
import com.linaqruf.portalakademik.irs.IRSActivity;
import com.linaqruf.portalakademik.profile.ProfileActivity;
import com.linaqruf.portalakademik.R;
import com.linaqruf.portalakademik.dashboard.agenda.AgendaAdapter;
import com.linaqruf.portalakademik.dashboard.agenda.SetterGetterAgenda;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    RecyclerView recyclerViewAgenda;

    ArrayList<SetterGetter> datamenu;
    ArrayList<SetterGetterAgenda> agenda;
    LinearLayoutManager linearLayoutManager;
    AgendaAdapter adapterAgenda;
    //
    ImageView imgProfile;

    LinearLayout menuIrs, menuIhs, menuSipKp, menuTA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerViewAgenda        =   findViewById(R.id.rv_agenda);

//
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

        menuIrs =findViewById(R.id.menuIrs);
        menuIhs =findViewById(R.id.menuIhs);
        menuSipKp =findViewById(R.id.menuSipKp);
        menuTA =findViewById(R.id.menuTA);

        menuIrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, IRSActivity.class);
                startActivity(intent);
            }
        });
        menuIhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, IHSActivity.class);
                startActivity(intent);
            }
        });
        menuSipKp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        menuTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

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