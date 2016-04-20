package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seasons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        Button seasonFirst = (Button)findViewById(R.id.season_first);
        seasonFirst.setTypeface(font);
        Button seasonSecond = (Button)findViewById(R.id.season_second);
        seasonSecond.setTypeface(font);
        Button seasonThird = (Button)findViewById(R.id.season_third);
        seasonThird.setTypeface(font);
        Button seasonFourth = (Button)findViewById(R.id.season_fourth);
        seasonFourth.setTypeface(font);
        Button seasonFifth = (Button)findViewById(R.id.season_fifth);
        seasonFifth.setTypeface(font);
        Button seasonSixth = (Button)findViewById(R.id.season_sixth);
        seasonSixth.setTypeface(font);
    }

    // Button for displaying first Season

    public void seasonFirst(View view) {
        Button seasonFirstButton = (Button) findViewById(R.id.season_first);

//        seasonFirstButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Seasons.this, SeasonFirst.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying second Season

    public void seasonSecond(View view) {
        Button seasonSecondButton = (Button) findViewById(R.id.season_second);

//        seasonSecondButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Seasons.this, SeasonSecond.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying third Season

    public void seasonThird(View view) {
        Button seasonThirdButton = (Button) findViewById(R.id.season_third);

//        seasonThirdButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Seasons.this, SeasonThird.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying fourth Season

    public void seasonFourth(View view) {
        Button seasonFourthButton = (Button) findViewById(R.id.season_fourth);

//        seasonFourthButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Seasons.this, SeasonFourth.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying fifth Season

    public void seasonFifth(View view) {
        Button seasonFifthButton = (Button) findViewById(R.id.season_fifth);

//        seasonFifthButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Seasons.this, SeasonFifth.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying sixth Season

    public void seasonSixth(View view) {
        Button seasonSixthButton = (Button) findViewById(R.id.season_sixth);

//        seasonSixthButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Seasons.this, SeasonSixth.class);
                startActivity(intent);
//            }
//        });
    }
}
