package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // numbers array
        ArrayList<String> ewords = new ArrayList<String>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"));
        ArrayList<String> bwords = new ArrayList<String>(Arrays.asList("imo", "ibili", "itatu", "cine", "cisano", "mutanda", "cine lubali", "cine konse konse", "pabula", "ikumi"));
        int [] resource_id = new int []{R.drawable.number_one, R.drawable.number_two, R.drawable.number_three, R.drawable.number_four, R.drawable.number_five, R.drawable.number_six, R.drawable.number_seven, R.drawable.number_eight, R.drawable.number_nine, R.drawable.number_ten};

        ArrayList<Word> words = new ArrayList<Word>();

        int tempwords_size = ewords.size();
        for (int i=0; i<tempwords_size; i++){
            words.add(new Word(this, bwords.get(i), ewords.get(i), resource_id[i]));
        }

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView list_view = (ListView) findViewById(R.id.list);

        list_view.setAdapter(adapter);
    }
}