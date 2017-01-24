package com.example.pau.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.i("STATE: ", "onCreate");

        ImageButton bck = (ImageButton) findViewById(R.id.main_bck);
        ImageButton fwd = (ImageButton) findViewById(R.id.main_fwd);
        bck.setOnClickListener(this);
        fwd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.main_bck:
                startActivity(new Intent(getApplicationContext(), Activity3.class));
            case R.id.main_fwd:
                startActivity(new Intent(getApplicationContext(), Activity2.class));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("STATE: ", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("STATE: ", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("STATE: ", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("STATE: ", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("STATE: ", "onDestroy");
    }
}
