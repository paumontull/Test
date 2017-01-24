package com.example.pau.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Activity3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton bck = (ImageButton) findViewById(R.id.activity3_bck);
        ImageButton fwd = (ImageButton) findViewById(R.id.activity3_fwd);
        bck.setOnClickListener(this);
        fwd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.activity3_bck:
                startActivity(new Intent(getApplicationContext(), Activity2.class));
            case R.id.activity3_fwd:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
    }
}
