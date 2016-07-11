package com.example.delva.screenyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen13);
    }

    public void funcScreen13 (View v) {
        Intent i= new Intent(Screen13Activity.this,Screen14Activity.class);
    }
}
