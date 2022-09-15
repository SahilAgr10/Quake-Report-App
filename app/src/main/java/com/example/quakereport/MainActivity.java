package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Word> earthquakes = QueryUtils.earthquakes();

        
        // Find a reference to the {@link ListView} in the layout
        ListView listView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        WordAdapter adapter = new WordAdapter(this,earthquakes);

        listView.setAdapter(adapter);


        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface

    }
}