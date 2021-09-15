package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Monday extends AppCompatActivity {

    ImageView imageViewMon,imageViewTue,imageViewWed,imageViewThu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        imageViewMon=findViewById(R.id.imageViewMon);
        imageViewTue=findViewById(R.id.imageViewTue);
        imageViewWed=findViewById(R.id.imageViewWed);
        imageViewThu=findViewById(R.id.imageViewThu);

        imageViewTue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Monday.this,MainActivity.class);
                startActivity(intent);
            }
        });

        imageViewWed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Monday.this,Wednesday.class);
                startActivity(intent);
            }
        });

        imageViewThu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Monday.this,Thursday.class);
                startActivity(intent);
            }
        });
    }
}