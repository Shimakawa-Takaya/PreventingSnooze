package com.takaya_shimakawa.prevent_over_sleep.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.takaya_shimakawa.prevent_over_sleep.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autocomplete_station);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, STATIONS);
        textView.setAdapter(adapter);
    }



    static final String[] STATIONS = new String[]{
            "A","B","c","d"
    };
}

