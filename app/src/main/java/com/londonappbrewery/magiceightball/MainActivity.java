package com.londonappbrewery.magiceightball;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball8 = findViewById(R.id.ball8_image);

        final int[] balls = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        Button ask = findViewById(R.id.ask);

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnumber = new Random();
                int number = rnumber.nextInt(5);
                int ResourceId = balls[number];
                ball8.setImageResource(ResourceId);

            }
        });


    }
}
