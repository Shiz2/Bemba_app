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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        // numbers array
        ArrayList<String> ewords = new ArrayList<String>(Arrays.asList("Mother", "Father", "Sister", "Brother", "Auntie (paternal)", "Uncle (paternal)", "Auntie (maternal)", "Uncle (maternal)", "Grandmother", "Grandfather", "Mother-in-law", "Father-in-law", "Wife (or Husband)", "Friend"));
        ArrayList<String> bwords = new ArrayList<String>(Arrays.asList("Mayo", "Tata", "Nkashi", "Ndume", "Mayosenge", "Tata mwaice", "Mayo mwaice", "Yama", "Mama", "Shikulu", "Mamafyala", "Tatafyala", "Mukashi", "Mulume", "Mwina mwandi", "Munandi"));
        int [] resource_id = new int[]{R.drawable.family_mother, R.drawable.family_father, R.drawable.family_younger_sister, R.drawable.family_younger_brother, R.drawable.family_older_sister, R.drawable.family_older_brother, R.drawable.family_older_sister, R.drawable.family_older_brother, R.drawable.family_grandmother, R.drawable.family_grandfather, R.drawable.family_mother, R.drawable.family_father, R.drawable.family_mother, R.drawable.family_son};

        ArrayList<Word> words = new ArrayList<Word>();

        int tempwords_size = ewords.size();
        for (int i=0; i<tempwords_size; i++){
            words.add(new Word(this, bwords.get(i), ewords.get(i), resource_id[i]));
        }

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView list_view = (ListView) findViewById(R.id.list);

        list_view.setAdapter(adapter);
    }
}