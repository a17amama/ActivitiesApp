package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);
        // Get the Intent that started this activity and extract the string
        Intent fonster = getIntent();
        Bundle klump = fonster.getExtras();
        String bergnamn = klump.getString("Bergnamn");
        String bergplats = klump.getString("Bergplats");
        String berghojd = klump.getString("Berghojd");

        // Capture the layout's TextView and set the string as its text
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setText(bergnamn);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setText(bergplats);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setText(berghojd);
    }
}
