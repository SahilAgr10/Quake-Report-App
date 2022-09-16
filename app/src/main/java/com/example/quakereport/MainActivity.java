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

        ArrayList<Word> earthquakes = QueryUtils.earthquake();
        // Find a reference to the {@link ListView} in the layout
        ListView listView = (ListView) findViewById(R.id.list);
        WordAdapter adapter = new WordAdapter(this,earthquakes);
        listView.setAdapter(adapter);
    }
}