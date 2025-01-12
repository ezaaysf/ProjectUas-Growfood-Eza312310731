package com.example.growsfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cart2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart2);

        ImageView btnhome = findViewById(R.id.fhome);
        ImageView btnfav = findViewById(R.id.ffavorite);
        ImageView btncart = findViewById(R.id.cart);
        ImageView btnprofile = findViewById(R.id.profile);
        ImageView btncekout = findViewById(R.id.addco);
        ImageView btntofavorite = findViewById(R.id.tofavorite);


        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart2.this, home.class);
                startActivity(intent);
            }
        });

        btnfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart2.this, favorite.class);
                startActivity(intent);
            }
        });

        btncart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart2.this, cart2.class);
                startActivity(intent);
            }
        });

        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart2.this, profile.class);
                startActivity(intent);
            }
        });

        btncekout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart2.this, profile.class);
                startActivity(intent);
            }
        });

        btntofavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart2.this, favorite.class);
                startActivity(intent);
            }
        });
    }
}