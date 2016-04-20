package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main_Page extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__page);

//        ReplaceFont.replaceDefaultFont(this, "DEFAULT", "morpheus.ttf");


        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        Button aLDivisionButton = (Button)findViewById(R.id.a_L_Division);
        aLDivisionButton.setTypeface(font);
        Button mTDivision = (Button)findViewById(R.id.m_T_Division);
        mTDivision.setTypeface(font);
        Button organisations = (Button)findViewById(R.id.organisations);
        organisations.setTypeface(font);
        Button religions = (Button)findViewById(R.id.religions);
        religions.setTypeface(font);
        Button seasons = (Button)findViewById(R.id.seasons);
        seasons.setTypeface(font);

    }

    // Button for displaying Great houses A - L

    public void aLDivision(View view) {
        Button aLDivisionButton = (Button) findViewById(R.id.a_L_Division);

//        aLDivisionButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Main_Page.this, aLDivision.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying Great houses M - T

    public void mTDivision(View view) {
        Button mTDivisionButton = (Button) findViewById(R.id.m_T_Division);

//        mTDivisionButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Main_Page.this, mTDivision.class);
                startActivity(intent);
            }
//        });
 //   }

    // Button for displaying Organisations

    public void organisations(View view) {
        Button organisationsButton = (Button) findViewById(R.id.organisations);

//        organisationsButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Main_Page.this, Organisations.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying Religions

    public void religions(View view) {
        Button religionsButton = (Button) findViewById(R.id.religions);

//        religionsButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Main_Page.this, Religions.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying Seasons

    public void seasons(View view) {
        Button seasonsButton = (Button) findViewById(R.id.seasons);

//        seasonsButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Main_Page.this, Seasons.class);
                startActivity(intent);
//            }
//        });
    }


}
