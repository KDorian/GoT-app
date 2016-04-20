package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Organisations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organisations);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView nightswatch = (TextView)findViewById(R.id.text_nightswatch);
        nightswatch.setTypeface(font);
        TextView ironBank = (TextView)findViewById(R.id.text_ironBank);
        ironBank.setTypeface(font);
        TextView kingsguard = (TextView)findViewById(R.id.text_kingsguard);
        kingsguard.setTypeface(font);
        TextView brotherhood = (TextView)findViewById(R.id.text_brotherhood);
        brotherhood.setTypeface(font);

    }

    // ImageButton to display information about Iron Bank

    public void ironBank(View view) {
        ImageButton ironBankButton = (ImageButton) findViewById(R.id.button_ironBank);

//        ironBankButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Organisations.this, IronBank.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about Brotherhood without Banners

    public void brotherhood(View view) {
        ImageButton brotherhoodButton = (ImageButton) findViewById(R.id.button_brotherhood);

//        brotherhoodButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Organisations.this, Brotherhood.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about Kingsguard

    public void kingsguard(View view) {
        ImageButton kingsguardButton = (ImageButton) findViewById(R.id.button_kingsguard);

//        kingsguardButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Organisations.this, Kingsguard.class);
                startActivity(intent);
//            }
//        });
    }

    // ImageButton to display information about Night's Watch

    public void nightsWatch(View view) {
        ImageButton nightsWatchButton = (ImageButton) findViewById(R.id.button_nights_watch);

//        nightsWatchButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Organisations.this, NightsWatch.class);
                startActivity(intent);
//            }
//        });
    }
}
