package com.example.android.gotapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HouseTargaryen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_targaryen);

        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_targaryen);
        title.setTypeface(font);
        TextView story = (TextView)findViewById(R.id.story_text_targaryen);
        story.setTypeface(font);
        TextView call = (TextView)findViewById(R.id.call_text_targaryen);
        call.setTypeface(font);
    }
}
