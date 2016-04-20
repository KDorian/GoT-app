package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SeasonFifth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_fifth);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_seasonFifth);
        title.setTypeface(font);
        Button se05plot = (Button)findViewById(R.id.se_05_plot);
        se05plot.setTypeface(font);
        Button se05ep01 = (Button)findViewById(R.id.se_05_ep_01);
        se05ep01.setTypeface(font);
        Button se05ep02 = (Button)findViewById(R.id.se_05_ep_02);
        se05ep02.setTypeface(font);
        Button se05ep03 = (Button)findViewById(R.id.se_05_ep_03);
        se05ep03.setTypeface(font);
        Button se05ep04 = (Button)findViewById(R.id.se_05_ep_04);
        se05ep04.setTypeface(font);
        Button se05ep05 = (Button)findViewById(R.id.se_05_ep_05);
        se05ep05.setTypeface(font);
        Button se05ep06 = (Button)findViewById(R.id.se_05_ep_06);
        se05ep06.setTypeface(font);
        Button se05ep07 = (Button)findViewById(R.id.se_05_ep_07);
        se05ep07.setTypeface(font);
        Button se05ep08 = (Button)findViewById(R.id.se_05_ep_08);
        se05ep08.setTypeface(font);
        Button se05ep09 = (Button)findViewById(R.id.se_05_ep_09);
        se05ep09.setTypeface(font);
        Button se05ep10 = (Button)findViewById(R.id.se_05_ep_10);
        se05ep10.setTypeface(font);
    }
// Button for se5 plot

    public void se05plot(View view) {
        Button se05plotButton = (Button) findViewById(R.id.se_05_plot);

//        se05plotButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Plot.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep1

    public void se05ep01(View view) {
        Button se05ep01Button = (Button) findViewById(R.id.se_05_ep_01);

//        se05ep01Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep01.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep2

    public void se05ep02(View view) {
        Button se05ep02Button = (Button) findViewById(R.id.se_05_ep_02);

//        se05ep02Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep02.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep3

    public void se05ep03(View view) {
        Button se05ep03Button = (Button) findViewById(R.id.se_05_ep_03);

//        se05ep03Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep03.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep4

    public void se05ep04(View view) {
        Button se05ep04Button = (Button) findViewById(R.id.se_05_ep_04);

//        se05ep04Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep04.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep5

    public void se05ep05(View view) {
        Button se05ep05Button = (Button) findViewById(R.id.se_05_ep_05);

//        se05ep05Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep05.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep6

    public void se05ep06(View view) {
        Button se05ep06Button = (Button) findViewById(R.id.se_05_ep_06);

//        se05ep06Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep06.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep7

    public void se05ep07(View view) {
        Button se05ep07Button = (Button) findViewById(R.id.se_05_ep_07);

//        se05ep07Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep07.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep8

    public void se05ep08(View view) {
        Button se05ep08Button = (Button) findViewById(R.id.se_05_ep_08);

//        se05ep08Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep08.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep9

    public void se05ep09(View view) {
        Button se05ep09Button = (Button) findViewById(R.id.se_05_ep_09);

//        se05ep09Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep09.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se5 ep10

    public void se05ep10(View view) {
        Button se05ep10Button = (Button) findViewById(R.id.se_05_ep_10);

//        se05ep10Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFifth.this, Se05Ep10.class);
                startActivity(intent);
//            }
//        });
    }

//    // Button for coming back to Main Page
//
//    public void se05mp(View view) {
//        Button se05mpButton = (Button) findViewById(R.id.se_05_mp);
//
//        se05mpButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonFifth.this, Main_Page.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    // Button for coming back to Second Season
//
//    public void se05next(View view) {
//        Button se05nextButton = (Button) findViewById(R.id.se_05_next);
//
//        se05nextButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonFifth.this, SeasonSixth.class);
//                startActivity(intent);
//            }
//        });
//    }
}
