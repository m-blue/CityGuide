package com.example.cityguide;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] attraction = {"Art Institute of Chicage", "Magnificent Mile", "Willis Tower", "Navy Pier", "Water Tower"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,R.id.travel, attraction));

    }
}
