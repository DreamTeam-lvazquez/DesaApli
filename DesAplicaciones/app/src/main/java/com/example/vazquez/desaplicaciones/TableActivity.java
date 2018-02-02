package com.example.vazquez.desaplicaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }

    public void nextActivityCalc(View view) {
        startActivity(new Intent(this,
                GridActivity.class));
    }

    public void nextActivityForm(View view) {
        startActivity(new Intent(this,
                LinearActivity.class));
    }
}
