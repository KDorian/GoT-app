package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SeasonFourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_fourth);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_seasonFourth);
        title.setTypeface(font);
        Button se04plot = (Button)findViewById(R.id.se_04_plot);
        se04plot.setTypeface(font);
        Button se04ep01 = (Button)findViewById(R.id.se_04_ep_01);
        se04ep01.setTypeface(font);
        Button se04ep02 = (Button)findViewById(R.id.se_04_ep_02);
        se04ep02.setTypeface(font);
        Button se04ep03 = (Button)findViewById(R.id.se_04_ep_03);
        se04ep03.setTypeface(font);
        Button se04ep04 = (Button)findViewById(R.id.se_04_ep_04);
        se04ep04.setTypeface(font);
        Button se04ep05 = (Button)findViewById(R.id.se_04_ep_05);
        se04ep05.setTypeface(font);
        Button se04ep06 = (Button)findViewById(R.id.se_04_ep_06);
        se04ep06.setTypeface(font);
        Button se04ep07 = (Button)findViewById(R.id.se_04_ep_07);
        se04ep07.setTypeface(font);
        Button se04ep08 = (Button)findViewById(R.id.se_04_ep_08);
        se04ep08.setTypeface(font);
        Button se04ep09 = (Button)findViewById(R.id.se_04_ep_09);
        se04ep09.setTypeface(font);
        Button se04ep10 = (Button)findViewById(R.id.se_04_ep_10);
        se04ep10.setTypeface(font);
    }


    // Button for se4 plot

    public void se04plot(View view) {
        Button se04plotButton = (Button) findViewById(R.id.se_04_plot);

//        se04plotButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Plot.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep1

    public void se04ep01(View view) {
        Button se04ep01Button = (Button) findViewById(R.id.se_04_ep_01);

//        se04ep01Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep01.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep2

    public void se04ep02(View view) {
        Button se04ep02Button = (Button) findViewById(R.id.se_04_ep_02);

//        se04ep02Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep02.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep3

    public void se04ep03(View view) {
        Button se04ep03Button = (Button) findViewById(R.id.se_04_ep_03);

//        se04ep03Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep03.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep4

    public void se04ep04(View view) {
        Button se04ep04Button = (Button) findViewById(R.id.se_04_ep_04);

//        se04ep04Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep04.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep5

    public void se04ep05(View view) {
        Button se04ep05Button = (Button) findViewById(R.id.se_04_ep_05);

//        se04ep05Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep05.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep6

    public void se04ep06(View view) {
        Button se04ep06Button = (Button) findViewById(R.id.se_04_ep_06);

//        se04ep06Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep06.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep7

    public void se04ep07(View view) {
        Button se04ep07Button = (Button) findViewById(R.id.se_04_ep_07);

//        se04ep07Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep07.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep8

    public void se04ep08(View view) {
        Button se04ep08Button = (Button) findViewById(R.id.se_04_ep_08);

//        se04ep08Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep08.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep9

    public void se04ep09(View view) {
        Button se04ep09Button = (Button) findViewById(R.id.se_04_ep_09);

//        se04ep09Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep09.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se4 ep10

    public void se04ep10(View view) {
        Button se04ep10Button = (Button) findViewById(R.id.se_04_ep_10);

//        se04ep10Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFourth.this, Se04Ep10.class);
                startActivity(intent);
//            }
//        });
    }

//    // Button for coming back to Main Page
//
//    public void se04mp(View view) {
//        Button se04mpButton = (Button) findViewById(R.id.se_04_mp);
//
//        se01mpButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonFourth.this, Main_Page.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    // Button for coming back to Second Season
//
//    public void se04next(View view) {
//        Button se04nextButton = (Button) findViewById(R.id.se_04_next);
//
//        se04nextButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonFourth.this, SeasonFifth.class);
//                startActivity(intent);
//            }
//        });
//    }
}

