package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Thursday extends AppCompatActivity {

    ImageView imageViewLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        imageViewLeft=findViewById(R.id.imageViewLeft);

        imageViewLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thursday.this,Wednesday.class);
                startActivity(intent);
            }
        });


        }


    }
