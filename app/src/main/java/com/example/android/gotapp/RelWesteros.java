package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RelWesteros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rel_westeros);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_relWesteros);
        title.setTypeface(font);
        Button oldGods = (Button)findViewById(R.id.old_gods);
        oldGods.setTypeface(font);
        Button faithSeven = (Button)findViewById(R.id.faith_seven);
        faithSeven.setTypeface(font);
        Button drownedGod = (Button)findViewById(R.id.drowned_god);
        drownedGod.setTypeface(font);
    }

    // Button for displaying Old Gods Religion

    public void oldGods(View view) {
        Button oldGodsButton = (Button) findViewById(R.id.old_gods);

//        oldGodsButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(RelWesteros.this, RelOldGods.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying The Faith of the Seven Religion

    public void faithSeven(View view) {
        Button faithSevenButton = (Button) findViewById(R.id.faith_seven);

//        faithSevenButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(RelWesteros.this, RelFaithSeven.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying Drowned God Religion

    public void drownedGod(View view) {
        Button drownedGodButton = (Button) findViewById(R.id.drowned_god);

//        drownedGodButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(RelWesteros.this, RelDrownedGod.class);
                startActivity(intent);
//            }
//        });
    }



}
