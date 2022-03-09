package com.linaqruf.portalakademik.irs.detailIRS;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.linaqruf.portalakademik.R;
import com.linaqruf.portalakademik.irs.IRSActivity;
import com.linaqruf.portalakademik.irs.IRSAdapter;
import com.linaqruf.portalakademik.irs.SetterGetterIRS;

import java.util.ArrayList;

public class DetailIRSActivity extends AppCompatActivity {
    TextView matakuliah, kodematkul, sks, dosenpengampu;
    RecyclerView recyclerViewIRSdetail;
    ArrayList<SetterGetterIRSdetail> detailIrs;

    LinearLayoutManager linearLayoutManager;
    DetaiIRSAdapter detailIrsAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_irsactivity);

//      DETAIL
        matakuliah = findViewById(R.id.mataKuliah);
        matakuliah.setText("SPPSI");

        kodematkul = findViewById(R.id.kodeMatkul);
        kodematkul.setText("TSI191");

        sks = findViewById(R.id.sks);
        sks.setText("22");

        dosenpengampu = findViewById(R.id.dosenPengampu);
        dosenpengampu.setText("Prof. Ir Surya Afnarius, M.Sc.,Ph.D");


//      AGENDA
        recyclerViewIRSdetail        =   findViewById(R.id.rv_irs_Detail);

        addIrs();
        linearLayoutManager   =   new LinearLayoutManager(DetailIRSActivity.this);
        recyclerViewIRSdetail.setLayoutManager(linearLayoutManager);
        detailIrsAdapter             =   new DetaiIRSAdapter(detailIrs);
        recyclerViewIRSdetail.setAdapter(detailIrsAdapter);
//

    }


    private void addIrs() {
        detailIrs = new ArrayList<>();
        detailIrs.add(new SetterGetterIRSdetail(
                "Minggu Ke 1",
                "Array dan pemograman restoran kentang\n" +
                        "pada bahasa pemograman Borland C."));
        detailIrs.add(new SetterGetterIRSdetail(
                "Minggu Ke 1",
                "Array dan pemograman restoran kentang\n" +
                        "pada bahasa pemograman Borland C."));
        detailIrs.add(new SetterGetterIRSdetail(
                "Minggu Ke 1",
                "Array dan pemograman restoran kentang\n" +
                        "pada bahasa pemograman Borland C."));
        detailIrs.add(new SetterGetterIRSdetail(
                "Minggu Ke 1",
                "Array dan pemograman restoran kentang\n" +
                        "pada bahasa pemograman Borland C."));
        detailIrs.add(new SetterGetterIRSdetail(
                "Minggu Ke 1",
                "Array dan pemograman restoran kentang\n" +
                        "pada bahasa pemograman Borland C."));
        detailIrs.add(new SetterGetterIRSdetail(
                "Minggu Ke 1",
                "Array dan pemograman restoran kentang\n" +
                        "pada bahasa pemograman Borland C."));
        detailIrs.add(new SetterGetterIRSdetail(
                "Minggu Ke 1",
                "Array dan pemograman restoran kentang\n" +
                        "pada bahasa pemograman Borland C."));
    }
}