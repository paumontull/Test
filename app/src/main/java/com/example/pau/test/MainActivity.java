package com.example.pau.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        Log.i("STATE: ", "onCreate");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.bck:
                startActivity(new Intent(getApplicationContext(), Activity3.class));
                finish();
                return true;
            case R.id.fwd:
                startActivity(new Intent(getApplicationContext(), Activity2.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
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
