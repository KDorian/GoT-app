package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SeasonSixth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_sixth);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_seasonSixth);
        title.setTypeface(font);
//        Button se06plot = (Button)findViewById(R.id.se_06_plot);
//        se06plot.setTypeface(font);
        Button se06ep01 = (Button)findViewById(R.id.se_06_ep_01);
        se06ep01.setTypeface(font);
        Button se06ep02 = (Button)findViewById(R.id.se_06_ep_02);
        se06ep02.setTypeface(font);
        Button se06ep03 = (Button)findViewById(R.id.se_06_ep_03);
        se06ep03.setTypeface(font);
        Button se06ep04 = (Button)findViewById(R.id.se_06_ep_04);
        se06ep04.setTypeface(font);
        Button se06ep05 = (Button)findViewById(R.id.se_06_ep_05);
        se06ep05.setTypeface(font);
        Button se06ep06 = (Button)findViewById(R.id.se_06_ep_06);
        se06ep06.setTypeface(font);
        Button se06ep07 = (Button)findViewById(R.id.se_06_ep_07);
        se06ep07.setTypeface(font);
        Button se06ep08 = (Button)findViewById(R.id.se_06_ep_08);
        se06ep08.setTypeface(font);
        Button se06ep09 = (Button)findViewById(R.id.se_06_ep_09);
        se06ep09.setTypeface(font);
        Button se06ep10 = (Button)findViewById(R.id.se_06_ep_10);
        se06ep10.setTypeface(font);
    }
//    // Button for se6 plot
//
//    public void se06plot(View view) {
//        Button se06plotButton = (Button) findViewById(R.id.se_06_plot);
//
//        se06plotButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonSixth.this, Se06Plot.class);
//                startActivity(intent);
//            }
//        });
//    }

    // Button for se6 ep1

    public void se06ep01(View view) {
        Button se06ep01Button = (Button) findViewById(R.id.se_06_ep_01);

//        se06ep01Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep01.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se6 ep2

    public void se06ep02(View view) {
        Button se06ep02Button = (Button) findViewById(R.id.se_06_ep_02);

//        se06ep02Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep02.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se6 ep3

    public void se06ep03(View view) {
        Button se06ep03Button = (Button) findViewById(R.id.se_06_ep_03);

//        se06ep03Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep03.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se6 ep4

    public void se06ep04(View view) {
        Button se06ep04Button = (Button) findViewById(R.id.se_06_ep_04);

//        se06ep04Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep04.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se6 ep5

    public void se06ep05(View view) {
        Button se06ep05Button = (Button) findViewById(R.id.se_06_ep_05);

//        se06ep05Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep05.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se6 ep6

    public void se06ep06(View view) {
        Button se06ep06Button = (Button) findViewById(R.id.se_06_ep_06);

//        se06ep06Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep06.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se6 ep7

    public void se06ep07(View view) {
        Button se06ep07Button = (Button) findViewById(R.id.se_06_ep_07);

//        se06ep07Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep07.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se6 ep8

    public void se06ep08(View view) {
        Button se06ep08Button = (Button) findViewById(R.id.se_06_ep_08);

//        se06ep08Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep08.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se6 ep9

    public void se06ep09(View view) {
        Button se06ep09Button = (Button) findViewById(R.id.se_06_ep_09);

//        se06ep09Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep09.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for se6 ep10

    public void se06ep10(View view) {
        Button se06ep10Button = (Button) findViewById(R.id.se_06_ep_10);

//        se06ep10Button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(SeasonSixth.this, Se06Ep10.class);
                startActivity(intent);
//            }
//        });
    }

//    // Button for coming back to Main Page
//
//    public void se06mp(View view) {
//        Button se06mpButton = (Button) findViewById(R.id.se_06_mp);
//
//        se06mpButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonSixth.this, Main_Page.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    // Button for coming back to Second Season
//
//    public void se06next(View view) {
//        Button se06nextButton = (Button) findViewById(R.id.se_06_next);
//
//        se06nextButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SeasonSixth.this, SeasonSeventh.class);
//                startActivity(intent);
//            }
//        });
//    }
}
