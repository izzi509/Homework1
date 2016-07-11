package com.example.delva.screenyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen19Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen19);
    }
    public void funcScreen19 (View v) {
        Intent i= new Intent(Screen19Activity.this,Screen20Activity.class);
    }
}
