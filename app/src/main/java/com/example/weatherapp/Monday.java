package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Monday extends AppCompatActivity {

    ImageView imageViewRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        imageViewRight=findViewById(R.id.imageViewRight);

        imageViewRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Monday.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}