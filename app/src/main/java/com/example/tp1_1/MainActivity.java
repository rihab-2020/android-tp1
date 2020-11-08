package com.example.tp1_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity"," Hello World !");
        Log.e("MainActivity"," Error!");
        Log.w("MainActivity"," Warn !");
        Log.i("MainActivity"," Info !");

    }
}
