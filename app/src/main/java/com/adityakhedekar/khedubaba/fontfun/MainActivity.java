package com.adityakhedekar.khedubaba.fontfun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ArrayList<String> mStrings = mStrings = new ArrayList<String>();
    ArrayAdapter mArrayAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.listView);
        mArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mStrings);
    }

    public void clickMe(View view){
        Log.i(TAG, "clickMe: Pressed");
        mStrings.add("Hello World");
        mListView.setAdapter(mArrayAdapter);
    }
}
