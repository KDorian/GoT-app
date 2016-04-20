package com.example.android.gotapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Se01Ep01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se01_ep01);

        Typeface font = Typeface.createFromAsset(getAssets(), "morpheus.ttf");
        TextView title = (TextView)findViewById(R.id.title_text_se01ep01);
        title.setTypeface(font);
        TextView story = (TextView)findViewById(R.id.story_text_se01ep01);
        story.setTypeface(font);
    }
}
