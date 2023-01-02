package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AlamMayang extends AppCompatActivity {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_mayang);
        button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),About.class);
            startActivity(intent1);
        });
    }
}