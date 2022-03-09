package com.linaqruf.portalakademik.irs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.linaqruf.portalakademik.LoginActivity;
import com.linaqruf.portalakademik.R;
import com.linaqruf.portalakademik.dashboard.DashboardActivity;
import com.linaqruf.portalakademik.irs.detailIRS.DetailIRSActivity;


import java.util.ArrayList;

public class IRSActivity extends AppCompatActivity {

    TextView maksSKS, semester, dosenPA;
    RecyclerView recyclerViewIRS;
    ArrayList<SetterGetterIRS> irs;
    LinearLayoutManager linearLayoutManager;
    IRSAdapter adapterIrs;
    CardView cardSks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irsactivity);

//      DETAIL
        maksSKS = findViewById(R.id.maksSKS);
        maksSKS.setText("24");

        semester = findViewById(R.id.semester);
        semester.setText("Genap 2021/2022");

        dosenPA = findViewById(R.id.dosenPA);
        dosenPA.setText("Prof. Ir Surya Afnarius, M.Sc.,Ph.D");

//      AGENDA
        recyclerViewIRS        =   findViewById(R.id.rv_irs);

        addIrs();
        linearLayoutManager   =   new LinearLayoutManager(IRSActivity.this);
        recyclerViewIRS.setLayoutManager(linearLayoutManager);
        adapterIrs             =   new IRSAdapter(irs);
        recyclerViewIRS.setAdapter(adapterIrs);
//
        cardSks = findViewById(R.id.cardSKS);
        cardSks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IRSActivity.this, DetailIRSActivity.class);
                startActivity(intent);
            }
        });
    }


    private void addIrs() {
        irs            =   new ArrayList<>();
        irs.add(new SetterGetterIRS(
                "Bahasa Indonesia",
                "07.30-09.00",
                "Ronidin, SS. MA"));
        irs.add(new SetterGetterIRS(
                "Pemrograman Teknologi Bergerak",
                "10.10-11.40",
                "Husnil Kamil, MT"));
        irs.add(new SetterGetterIRS(
                "Manajemen Basis Data",
                "13.30-15.00",
                "Rahmatika Pratama Santi, MT "));
        irs.add(new SetterGetterIRS(
                "Akuisisi Data",
                "16.00 17.40",
                "Fajril Akbar, M.Sc"));
        irs.add(new SetterGetterIRS(
                "Akuisisi Data",
                "16.00 17.40",
                "Fajril Akbar, M.Sc"));
        irs.add(new SetterGetterIRS(
                "Akuisisi Data",
                "16.00 17.40",
                "Fajril Akbar, M.Sc"));
        irs.add(new SetterGetterIRS(
                "Akuisisi Data",
                "16.00 17.40",
                "Fajril Akbar, M.Sc"));
        irs.add(new SetterGetterIRS(
                "Akuisisi Data",
                "16.00 17.40",
                "Fajril Akbar, M.Sc"));




    }
}