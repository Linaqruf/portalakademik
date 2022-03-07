package com.linaqruf.portalakademik.ubahpassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.linaqruf.portalakademik.LoginActivity;
import com.linaqruf.portalakademik.R;
import com.linaqruf.portalakademik.dashboard.DashboardActivity;

public class UbahPasswordActivity extends AppCompatActivity {

    Button ubahButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah_password);

        ubahButton = findViewById(R.id.ubahBtn);
        ubahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UbahPasswordActivity.this, UbahPasswordActivity2.class);
                startActivity(intent);
            }
        });
    }
}