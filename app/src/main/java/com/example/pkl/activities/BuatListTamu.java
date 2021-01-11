package com.example.pkl.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pkl.R;

public class BuatListTamu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_list_tamu);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(BuatListTamu.this, MainActivity.class);
        startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(BuatListTamu.this, ListTamu.class);
        startActivity(intent);
    }
}
