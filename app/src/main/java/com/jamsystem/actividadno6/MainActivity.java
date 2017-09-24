package com.jamsystem.actividadno6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jamsystem.Main2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void cambio (View view){
        Intent objI = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(objI );




    }


}
