package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final TextView score = findViewById(R.id.tvScore);

        Bundle extras = getIntent().getExtras();
        String a = String.valueOf(extras.getInt("num"));
        score.setText(a);

    }
}