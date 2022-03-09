package com.linaqruf.portalakademik.ihs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.linaqruf.portalakademik.R;


import java.util.ArrayList;

public class IHSActivity extends AppCompatActivity {
    TextView maksSKS, maksMatkul, ipSemester;
    RecyclerView recyclerViewIHS;
    ArrayList<SetterGetterIHS> ihs;

    LinearLayoutManager linearLayoutManager;
    IHSAdapter adapterIhs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ihsactivity);

//      DETAIL
        maksSKS = findViewById(R.id.maksSKS);
        maksSKS.setText("24");

        maksMatkul = findViewById(R.id.maksMatKul);
        maksMatkul.setText("8");

        ipSemester = findViewById(R.id.ipSemester);
        ipSemester.setText("3.20");

//      AGENDA
        recyclerViewIHS        =   findViewById(R.id.rv_ihs);

        addIhs();
        linearLayoutManager   =   new LinearLayoutManager(IHSActivity.this);
        recyclerViewIHS.setLayoutManager(linearLayoutManager);
        adapterIhs             =   new IHSAdapter(ihs);
        recyclerViewIHS.setAdapter(adapterIhs);
//

    }


    private void addIhs() {
        ihs = new ArrayList<>();
        ihs.add(new SetterGetterIHS(
                "TSI101",
                "Bahasa Pemrograman Web",
                "A"));
        ihs.add(new SetterGetterIHS(
                "TSI101",
                "Bahasa Pemrograman Web",
                "B"));
        ihs.add(new SetterGetterIHS(
                "TSI101",
                "Bahasa Pemrograman Web",
                "B+"));
        ihs.add(new SetterGetterIHS(
                "TSI101",
                "Bahasa Pemrograman Web",
                "C"));
        ihs.add(new SetterGetterIHS(
                "TSI101",
                "Bahasa Pemrograman Web",
                "D"));
        ihs.add(new SetterGetterIHS(
                "TSI101",
                "Bahasa Pemrograman Web",
                "E"));
    }







    }