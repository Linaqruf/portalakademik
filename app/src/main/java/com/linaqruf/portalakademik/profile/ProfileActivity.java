package com.linaqruf.portalakademik.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.linaqruf.portalakademik.LoginActivity;
import com.linaqruf.portalakademik.R;
import com.linaqruf.portalakademik.dashboard.DashboardActivity;
import com.linaqruf.portalakademik.ubahpassword.UbahPasswordActivity;

public class ProfileActivity extends AppCompatActivity {

    Button logoutButton;
    Button ubahPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        logoutButton = findViewById(R.id.logoutbtn);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        ubahPasswordButton = findViewById(R.id.ubahpassword);
        ubahPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, UbahPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}