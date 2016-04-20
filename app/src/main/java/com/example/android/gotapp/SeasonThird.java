package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SeasonThird extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_third);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_seasonThird);
        title.setTypeface(font);
        Button se03plot = (Button)findViewById(R.id.se_03_plot);
        se03plot.setTypeface(font);
        Button se03ep01 = (Button)findViewById(R.id.se_03_ep_01);
        se03ep01.setTypeface(font);
        Button se03ep02 = (Button)findViewById(R.id.se_03_ep_02);
        se03ep02.setTypeface(font);
        Button se03ep03 = (Button)findViewById(R.id.se_03_ep_03);
        se03ep03.setTypeface(font);
        Button se03ep04 = (Button)findViewById(R.id.se_03_ep_04);
        se03ep04.setTypeface(font);
        Button se03ep05 = (Button)findViewById(R.id.se_03_ep_05);
        se03ep05.setTypeface(font);
        Button se03ep06 = (Button)findViewById(R.id.se_03_ep_06);
        se03ep06.setTypeface(font);
        Button se03ep07 = (Button)findViewById(R.id.se_03_ep_07);
        se03ep07.setTypeface(font);
        Button se03ep08 = (Button)findViewById(R.id.se_03_ep_08);
        se03ep08.setTypeface(font);
        Button se03ep09 = (Button)findViewById(R.id.se_03_ep_09);
        se03ep09.setTypeface(font);
        Button se03ep10 = (Button)findViewById(R.id.se_03_ep_10);
        se03ep10.setTypeface(font);
    }
    // Button for se3 plot

    public void se03plot(View view) {
        Button se03plotButton = (Button) findViewById(R.id.se_03_plot);

//        se03plotButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Plot.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se3 ep1

    public void se03ep01(View view) {
        Button se03ep01Button = (Button) findViewById(R.id.se_03_ep_01);

//        se03ep01Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep01.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se3 ep2

    public void se03ep02(View view) {
        Button se03ep02Button = (Button) findViewById(R.id.se_03_ep_02);

//        se03ep02Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep02.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se1 ep3

    public void se03ep03(View view) {
        Button se03ep03Button = (Button) findViewById(R.id.se_03_ep_03);

//        se03ep03Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep03.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se3 ep4

    public void se03ep04(View view) {
        Button se03ep04Button = (Button) findViewById(R.id.se_03_ep_04);

//        se03ep04Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep04.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se3 ep5

    public void se03ep05(View view) {
        Button se03ep05Button = (Button) findViewById(R.id.se_03_ep_05);

//        se03ep05Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep05.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se3 ep6

    public void se03ep06(View view) {
        Button se03ep06Button = (Button) findViewById(R.id.se_03_ep_06);

//        se03ep06Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep06.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se3 ep7

    public void se03ep07(View view) {
        Button se03ep07Button = (Button) findViewById(R.id.se_03_ep_07);

//        se03ep07Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep07.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se3 ep8

    public void se03ep08(View view) {
        Button se03ep08Button = (Button) findViewById(R.id.se_03_ep_08);

//        se03ep08Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep08.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se3 ep9

    public void se03ep09(View view) {
        Button se03ep09Button = (Button) findViewById(R.id.se_03_ep_09);

//        se03ep09Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep09.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se3 ep10

    public void se03ep10(View view) {
        Button se03ep10Button = (Button) findViewById(R.id.se_03_ep_10);

//        se03ep10Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonThird.this, Se03Ep10.class);
                startActivity(intent);
//            }
//        });
    }

//    // Button for coming back to Main Page
//
//    public void se03mp(View view) {
//        Button se03mpButton = (Button) findViewById(R.id.se_03_mp);
//
//        se03mpButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonThird.this, Main_Page.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    // Button for coming back to Second Season
//
//    public void se03next(View view) {
//        Button se03nextButton = (Button) findViewById(R.id.se_03_next);
//
//        se03nextButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonThird.this, SeasonFourth.class);
//                startActivity(intent);
//            }
//        });
//    }
}

