package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RelEssos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rel_essos);

        // Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_relEssos);
        title.setTypeface(font);
        Button greatStallion = (Button)findViewById(R.id.great_Stallion);
        greatStallion.setTypeface(font);
        Button lordLight = (Button)findViewById(R.id.lord_Light);
        lordLight.setTypeface(font);
        Button manyFacedGod = (Button)findViewById(R.id.many_Faced_God);
        manyFacedGod.setTypeface(font);
    }

    // Button for displaying Great Stallion Religion

    public void greatStallion(View view) {
        Button greatStallionButton = (Button) findViewById(R.id.great_Stallion);

//        greatStallionButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(RelEssos.this, RelGreatStallion.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying The Lord of Light Religion

    public void lordLight(View view) {
        Button lordLightButton = (Button) findViewById(R.id.lord_Light);

//        lordLightButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(RelEssos.this, RelLordLight.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying The Many-Faced God of Death Religion

    public void manyFacedGod(View view) {
        Button manyFacedGodButton = (Button) findViewById(R.id.many_Faced_God);

//        manyFacedGodButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(RelEssos.this, RelManyFacedGod.class);
                startActivity(intent);
//            }
//        });
    }
}
