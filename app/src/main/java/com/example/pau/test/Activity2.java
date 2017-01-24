package com.example.pau.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton bck = (ImageButton) findViewById(R.id.activity2_bck);
        ImageButton fwd = (ImageButton) findViewById(R.id.activity2_fwd);
        bck.setOnClickListener(this);
        fwd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.activity2_bck:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            case R.id.activity2_fwd:
                startActivity(new Intent(getApplicationContext(), Activity3.class));
        }
    }
}
