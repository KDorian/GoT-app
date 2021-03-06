package com.example.android.gotapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Se04Ep03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se04_ep03);

        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_se04ep03);
        title.setTypeface(font);
        TextView story = (TextView)findViewById(R.id.story_text_se04ep03);
        story.setTypeface(font);
    }
}
