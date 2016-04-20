package com.example.android.gotapp;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class SeasonSecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_second);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_seasonSecond);
        title.setTypeface(font);
        Button se02plot = (Button)findViewById(R.id.se_02_plot);
        se02plot.setTypeface(font);
        Button se02ep01 = (Button)findViewById(R.id.se_02_ep_01);
        se02ep01.setTypeface(font);
        Button se02ep02 = (Button)findViewById(R.id.se_02_ep_02);
        se02ep02.setTypeface(font);
        Button se02ep03 = (Button)findViewById(R.id.se_02_ep_03);
        se02ep03.setTypeface(font);
        Button se02ep04 = (Button)findViewById(R.id.se_02_ep_04);
        se02ep04.setTypeface(font);
        Button se02ep05 = (Button)findViewById(R.id.se_02_ep_05);
        se02ep05.setTypeface(font);
        Button se02ep06 = (Button)findViewById(R.id.se_02_ep_06);
        se02ep06.setTypeface(font);
        Button se02ep07 = (Button)findViewById(R.id.se_02_ep_07);
        se02ep07.setTypeface(font);
        Button se02ep08 = (Button)findViewById(R.id.se_02_ep_08);
        se02ep08.setTypeface(font);
        Button se02ep09 = (Button)findViewById(R.id.se_02_ep_09);
        se02ep09.setTypeface(font);
        Button se02ep10 = (Button)findViewById(R.id.se_02_ep_10);
        se02ep10.setTypeface(font);
    }




// Button for se2 plot

    public void se02plot(View view) {
        Button se02plotButton = (Button) findViewById(R.id.se_02_plot);

//        se02plotButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Plot.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se2 ep1

    public void se02ep01(View view) {
        Button se02ep01Button = (Button) findViewById(R.id.se_02_ep_01);

//        se02ep01Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep01.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se2 ep2

    public void se02ep02(View view) {
        Button se02ep02Button = (Button) findViewById(R.id.se_02_ep_02);

//        se02ep02Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep02.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep3

    public void se02ep03(View view) {
        Button se02ep03Button = (Button) findViewById(R.id.se_02_ep_03);

//        se02ep03Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep03.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se2 ep4

    public void se02ep04(View view) {
        Button se02ep04Button = (Button) findViewById(R.id.se_02_ep_04);

//        se02ep04Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep04.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se2 ep5

    public void se02ep05(View view) {
        Button se02ep05Button = (Button) findViewById(R.id.se_02_ep_05);

//        se02ep05Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep05.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se2 ep6

    public void se02ep06(View view) {
        Button se02ep06Button = (Button) findViewById(R.id.se_02_ep_06);

//        se02ep06Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep06.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se2 ep7

    public void se02ep07(View view) {
        Button se02ep07Button = (Button) findViewById(R.id.se_02_ep_07);

//        se02ep07Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep07.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se2 ep8

    public void se02ep08(View view) {
        Button se02ep08Button = (Button) findViewById(R.id.se_02_ep_08);

//        se02ep08Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep08.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se2 ep9

    public void se02ep09(View view) {
        Button se02ep09Button = (Button) findViewById(R.id.se_02_ep_09);

//        se02ep09Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep09.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se2 ep10

    public void se02ep10(View view) {
        Button se02ep10Button = (Button) findViewById(R.id.se_02_ep_10);

//        se02ep10Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSecond.this, Se02Ep10.class);
                startActivity(intent);
//            }
//        });
    }

//    // Button for coming back to Main Page
//
//    public void se01mp(View view) {
//        Button se01mpButton = (Button) findViewById(R.id.se_01_mp);
//
//        se01mpButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonSecond.this, Main_Page.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    // Button for coming back to Second Season
//
//    public void se01next(View view) {
//        Button se01nextButton = (Button) findViewById(R.id.se_01_next);
//
//        se01nextButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonSecond.this, SeasonThird.class);
//                startActivity(intent);
//            }
//        });
//    }
}

