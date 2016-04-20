package com.example.android.gotapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Brotherhood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brotherhood);

        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.textview_title_organisation_brotherhood);
        title.setTypeface(font);
        TextView story = (TextView)findViewById(R.id.textview_story_organisation_brotherhood);
        story.setTypeface(font);
    }
}
