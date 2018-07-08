package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // numbers array
        ArrayList<String> ewords = new ArrayList<String>(Arrays.asList("black", "white", "gray", "red", "yellow", "green"));
        ArrayList<String> bwords = new ArrayList<String>(Arrays.asList("ukufita", "ukubuta", "ukufitulukila", "ukukashika", "mutuntula", "katap katapa"));
        int [] resource_id = new int []{R.drawable.color_black, R.drawable.color_white, R.drawable.color_gray, R.drawable.color_red, R.drawable.color_mustard_yellow, R.drawable.color_green, };

        ArrayList<Word> words = new ArrayList<Word>();

        int tempwords_size = ewords.size();
        for (int i=0; i<tempwords_size; i++){
            words.add(new Word(this, bwords.get(i), ewords.get(i), resource_id[i]));
        }

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView list_view = (ListView) findViewById(R.id.list);

        list_view.setAdapter(adapter);
    }
}