package com.example.delva.screenyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen18Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen18);
    }

    public void funcScreen18 (View v) {
        Intent i= new Intent(Screen18Activity.this,Screen19Activity.class);
    }
}
