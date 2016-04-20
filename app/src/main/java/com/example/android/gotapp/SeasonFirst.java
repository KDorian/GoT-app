package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SeasonFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_first);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_seasonFirst);
        title.setTypeface(font);
        Button se01plot = (Button)findViewById(R.id.se_01_plot);
        se01plot.setTypeface(font);
        Button se01ep01 = (Button)findViewById(R.id.se_01_ep_01);
        se01ep01.setTypeface(font);
        Button se01ep02 = (Button)findViewById(R.id.se_01_ep_02);
        se01ep02.setTypeface(font);
        Button se01ep03 = (Button)findViewById(R.id.se_01_ep_03);
        se01ep03.setTypeface(font);
        Button se01ep04 = (Button)findViewById(R.id.se_01_ep_04);
        se01ep04.setTypeface(font);
        Button se01ep05 = (Button)findViewById(R.id.se_01_ep_05);
        se01ep05.setTypeface(font);
        Button se01ep06 = (Button)findViewById(R.id.se_01_ep_06);
        se01ep06.setTypeface(font);
        Button se01ep07 = (Button)findViewById(R.id.se_01_ep_07);
        se01ep07.setTypeface(font);
        Button se01ep08 = (Button)findViewById(R.id.se_01_ep_08);
        se01ep08.setTypeface(font);
        Button se01ep09 = (Button)findViewById(R.id.se_01_ep_09);
        se01ep09.setTypeface(font);
        Button se01ep10 = (Button)findViewById(R.id.se_01_ep_10);
        se01ep10.setTypeface(font);
    }

    // Button for se1 plot

    public void se01plot(View view) {
        Button se01plotButton = (Button) findViewById(R.id.se_01_plot);

//        se01plotButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Plot.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep1

    public void se01ep01(View view) {
        Button se01ep01Button = (Button) findViewById(R.id.se_01_ep_01);

//        se01ep01Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep01.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep2

    public void se01ep02(View view) {
        Button se01ep02Button = (Button) findViewById(R.id.se_01_ep_02);

//        se01ep02Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep02.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep3

    public void se01ep03(View view) {
        Button se01ep03Button = (Button) findViewById(R.id.se_01_ep_03);

//        se01ep03Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep03.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep4

    public void se01ep04(View view) {
        Button se01ep04Button = (Button) findViewById(R.id.se_01_ep_04);

//        se01ep04Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep04.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep5

    public void se01ep05(View view) {
        Button se01ep05Button = (Button) findViewById(R.id.se_01_ep_05);

//        se01ep05Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep05.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep6

    public void se01ep06(View view) {
        Button se01ep06Button = (Button) findViewById(R.id.se_01_ep_06);

//        se01ep06Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep06.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep7

    public void se01ep07(View view) {
        Button se01ep07Button = (Button) findViewById(R.id.se_01_ep_07);

//        se01ep07Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep07.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep8

    public void se01ep08(View view) {
        Button se01ep08Button = (Button) findViewById(R.id.se_01_ep_08);

//        se01ep08Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep08.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep9

    public void se01ep09(View view) {
        Button se01ep09Button = (Button) findViewById(R.id.se_01_ep_09);

//        se01ep09Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep09.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep10

    public void se01ep10(View view) {
        Button se01ep10Button = (Button) findViewById(R.id.se_01_ep_10);

//        se01ep10Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonFirst.this, Se01Ep10.class);
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
//                Intent intent = new Intent(SeasonFirst.this, Main_Page.class);
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
//                Intent intent = new Intent(SeasonFirst.this, SeasonSecond.class);
//                startActivity(intent);
//            }
//        });
//    }
}
