package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class things extends AppCompatActivity {

    TextView jobs, health;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);
        jobs=(TextView)findViewById(R.id.jobs);
        health=(TextView)findViewById(R.id.health);

        jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
                Intent intent=new Intent(things.this,MainActivity.class);
                startActivity(intent);
            }
        });

        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
                Intent intent=new Intent(things.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}