package com.example.android.gotapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HouseBaratheon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_baratheon);

        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_baratheon);
        title.setTypeface(font);
        TextView story = (TextView)findViewById(R.id.story_text_baratheon);
        story.setTypeface(font);
        TextView call = (TextView)findViewById(R.id.call_text_baratheon);
        call.setTypeface(font);
    }
}
