package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class mTDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_tdivision);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView martell = (TextView)findViewById(R.id.text_martell);
        martell.setTypeface(font);
        TextView stark = (TextView)findViewById(R.id.text_stark);
        stark.setTypeface(font);
        TextView targaryen = (TextView)findViewById(R.id.text_targaryen);
        targaryen.setTypeface(font);
        TextView tully = (TextView)findViewById(R.id.text_tully);
        tully.setTypeface(font);
        TextView tyrell = (TextView)findViewById(R.id.text_tyrell);
        tyrell.setTypeface(font);

    }

    // ImageButton to display information about House Martell

    public void martell(View view) {
        ImageButton martellButton = (ImageButton) findViewById(R.id.button_martell);

//        martellButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(mTDivision.this, HouseMartell.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about House Stark

    public void stark(View view) {
        ImageButton starkButton = (ImageButton) findViewById(R.id.button_stark);

//        starkButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(mTDivision.this, HouseStark.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about House Targaryen

    public void targaryen(View view) {
        ImageButton targaryenButton = (ImageButton) findViewById(R.id.button_targaryen);

//        targaryenButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(mTDivision.this, HouseTargaryen.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about House Tully

    public void tully(View view) {
        ImageButton tullyButton = (ImageButton) findViewById(R.id.button_tully);

//        tullyButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(mTDivision.this, HouseTully.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about House Tyrell

    public void tyrell(View view) {
        ImageButton tyrellButton = (ImageButton) findViewById(R.id.button_tyrell);

//        tyrellButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(mTDivision.this, HouseTyrell.class);
                startActivity(intent);
//            }
//        });
    }
}
