package com.example.delva.screenyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen12);
    }

    public void funcScreen12 (View v) {
        Intent i= new Intent(Screen12Activity.this,Screen13Activity.class);
    }
}
