package com.myapp.app.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button but,but2,but3,but4,but5,but6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but=(Button)findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "This button will launch my Media Streamer app", Toast.LENGTH_SHORT).show();
            }
        });
        but2=(Button)findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "This button will launch my Scores app", Toast.LENGTH_SHORT).show();
            }
        });
        but3=(Button)findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "This button will launch my Library app", Toast.LENGTH_SHORT).show();
            }
        });
        but4=(Button)findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "This button will launch my Gradle Project app", Toast.LENGTH_SHORT).show();
            }
        });
        but5=(Button)findViewById(R.id.button5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "This button will launch my Reader app", Toast.LENGTH_SHORT).show();
            }
        });
        but6=(Button)findViewById(R.id.button6);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "This button will launch my Capstone app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
