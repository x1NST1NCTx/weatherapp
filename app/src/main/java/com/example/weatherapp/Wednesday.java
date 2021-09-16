package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Wednesday extends AppCompatActivity {

    ImageView imageViewLeft,imageViewRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        imageViewLeft=findViewById(R.id.imageViewLeft);
        imageViewRight=findViewById(R.id.imageViewRight);

        imageViewLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wednesday.this,MainActivity.class);
                startActivity(intent);
            }
        });

        imageViewRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wednesday.this,Thursday.class);
                startActivity(intent);
            }
        });

    }
}