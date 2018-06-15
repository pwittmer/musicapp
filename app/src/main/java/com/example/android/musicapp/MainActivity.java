package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

// Find the View that shows the numbers category
        TextView playing = (TextView) findViewById(R.id.now_playing);

// Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view){
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }

        });

        // Find the View that shows the family category
        TextView library = (TextView) findViewById(R.id.my_library);

// Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view){
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }

        });

        // Find the View that shows the colors category
        TextView suggested = (TextView) findViewById(R.id.suggested_music);

// Set a click listener on that View
        suggested.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view){
                Intent suggestedIntent = new Intent(MainActivity.this, SuggestedActivity.class);
                startActivity(suggestedIntent);
            }

        });

    }
}
