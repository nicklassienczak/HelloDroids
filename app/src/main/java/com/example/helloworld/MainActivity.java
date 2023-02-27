package com.example.helloworld;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "App up and running");

            TextView textView = findViewById(R.id.textEdit);
            textView.setText("Welcome to my new application!");

        Log.d("MainActivity", "Log is working");

        // BUTTON SPWN MESSAGE

        Button btnSpawn = findViewById(R.id.button);
        TextView textSpawn = findViewById(R.id.textView);

        btnSpawn.setOnClickListener(view ->
                textSpawn.setVisibility(View.VISIBLE));
                //textSpawn.setText("You just clicked the button ayyyeeeeeee"));

    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Pausing the app");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Now resuming the application");
    }
}