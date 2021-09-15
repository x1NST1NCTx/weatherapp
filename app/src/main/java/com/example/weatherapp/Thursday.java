package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Thursday extends AppCompatActivity {

    ImageView imageViewMon,imageViewTue,imageViewWed,imageViewThu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        imageViewMon=findViewById(R.id.imageViewMon);
        imageViewTue=findViewById(R.id.imageViewTue);
        imageViewWed=findViewById(R.id.imageViewWed);
        imageViewThu=findViewById(R.id.imageViewThu);

        imageViewMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thursday.this,Monday.class);
                startActivity(intent);
            }
        });

        imageViewTue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thursday.this,MainActivity.class);
                startActivity(intent);
            }
        });

        imageViewWed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thursday.this,Wednesday.class);
                startActivity(intent);
            }
        });
    }
}