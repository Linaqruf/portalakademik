package com.linaqruf.portalakademik.ubahpassword;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.linaqruf.portalakademik.LoginActivity;
import com.linaqruf.portalakademik.R;

public class UbahPasswordActivity2 extends AppCompatActivity {

    Button konfirmasiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah_password2);

        konfirmasiButton = findViewById(R.id.konfirmasiBtn);
        konfirmasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UbahPasswordActivity2.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}