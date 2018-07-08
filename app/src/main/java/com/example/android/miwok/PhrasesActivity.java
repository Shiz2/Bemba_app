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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // numbers array
        ArrayList<String> ewords = new ArrayList<String>(Arrays.asList("I love you", "Welcome to Zambia!", "How is your day going?", "Thank you", "You are welcome", "Come", "Follow me", "She is sick", "Eat now", "Sleep now", "I like ..."));
        ArrayList<String> bwords = new ArrayList<String>(Arrays.asList("Nalikutemwa (sing)", "Mwaiseni ku Zambia", "Mwatandala shani? / Mwabomaba shani", "Natotela", "Awe, cilifye, mukwai", "Isa", "Nkonka", "Mulwele (s) / Balwele (pl)", "Lya nombaline (s)/ Lyeni nombaline(pl)", "Sendama (s)/ Sendameni (pl)", "Nalitemwa ..."));

        ArrayList<Word> words = new ArrayList<Word>();

        int tempwords_size = ewords.size();
        for (int i=0; i<tempwords_size; i++){
            words.add(new Word(this, bwords.get(i), ewords.get(i)));
        }

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView list_view = (ListView) findViewById(R.id.list);

        list_view.setAdapter(adapter);
    }
}