package com.example.android.gotapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HouseMartell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_martell);

        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_martell);
        title.setTypeface(font);
        TextView story = (TextView)findViewById(R.id.story_text_martell);
        story.setTypeface(font);
        TextView call = (TextView)findViewById(R.id.call_text_martell);
        call.setTypeface(font);
    }
}
