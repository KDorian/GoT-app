package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class aLDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_ldivision);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView arryn = (TextView)findViewById(R.id.textview_great_houses_a_l_arryn);
        arryn.setTypeface(font);
        TextView baratheon = (TextView)findViewById(R.id.textview_great_houses_a_l_baratheon);
        baratheon.setTypeface(font);
        TextView bolton = (TextView)findViewById(R.id.textview_great_houses_a_l_bolton);
        bolton.setTypeface(font);
        TextView frey = (TextView)findViewById(R.id.textview_great_houses_a_l_frey);
        frey.setTypeface(font);
        TextView greyjoy = (TextView)findViewById(R.id.textview_great_houses_a_l_greyjoy);
        greyjoy.setTypeface(font);
        TextView lannister = (TextView)findViewById(R.id.textview_great_houses_a_l_lannister);
        lannister.setTypeface(font);
    }

    // ImageButton to display information about House Arryn

    public void great_houses_a_l_arryn(View view) {
        ImageButton arrynButton = (ImageButton) findViewById(R.id.imagebutton_great_houses_a_l_arryn);

//        arrynButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(aLDivision.this, HouseArryn.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about House Baratheon

    public void great_houses_a_l_baratheon(View view) {
        ImageButton baratheonButton = (ImageButton) findViewById(R.id.imagebutton_great_houses_a_l_baratheon);

//        baratheonButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(aLDivision.this, HouseBaratheon.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about House Bolton

    public void great_houses_a_l_bolton(View view) {
        ImageButton boltonButton = (ImageButton) findViewById(R.id.imagebutton_great_houses_a_l_bolton);

//        boltonButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(aLDivision.this, HouseBolton.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about House Frey

    public void great_houses_a_l_frey(View view) {
        ImageButton freyButton = (ImageButton) findViewById(R.id.imagebutton_great_houses_a_l_frey);

//        freyButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(aLDivision.this, HouseFrey.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about House Greyjoy

    public void great_houses_a_l_greyjoy(View view) {
        ImageButton greyjoyButton = (ImageButton) findViewById(R.id.imagebutton_great_houses_a_l_greyjoy);

//        greyjoyButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(aLDivision.this, HouseGreyjoy.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about House Lannister

    public void great_houses_a_l_lannister(View view) {
        ImageButton lannisterButton = (ImageButton) findViewById(R.id.imagebutton_great_houses_a_l_lannister);

//        lannisterButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(aLDivision.this, HouseLannister.class);
                startActivity(intent);
//            }
//        });
    }
}
