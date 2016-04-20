package com.example.android.gotapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Religions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religions);


// Changing Default Font to morpheus Font
        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_religions);
        title.setTypeface(font);
        TextView story = (TextView)findViewById(R.id.story_text_religions);
        story.setTypeface(font);
        Button RelEssos = (Button)findViewById(R.id.relEssos);
        RelEssos.setTypeface(font);
        Button RelWesteros = (Button)findViewById(R.id.relWesteros);
        RelWesteros.setTypeface(font);
    }

    // Button for displaying Religions of Essos

    public void relEssos(View view) {
        Button relEssosButton = (Button) findViewById(R.id.relEssos);

//        relEssosButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Religions.this, RelEssos.class);
                startActivity(intent);
//            }
//        });
    }

    // Button for displaying Religions of Westeros

    public void relWesteros(View view) {
        Button relWesterosButton = (Button) findViewById(R.id.relWesteros);

//        relWesterosButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
                Intent intent = new Intent(Religions.this, RelWesteros.class);
                startActivity(intent);
//            }
//        });
    }
}
