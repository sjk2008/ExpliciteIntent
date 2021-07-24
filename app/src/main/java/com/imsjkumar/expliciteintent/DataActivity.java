package com.imsjkumar.expliciteintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        String userName = getIntent().getStringExtra("userName");

        welcome=findViewById(R.id.welcome);
        welcome.setText("Welcome:- "+userName);

    }
}