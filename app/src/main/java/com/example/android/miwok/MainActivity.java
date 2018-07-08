/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // add onClick listeners
        TextView numbers_view = (TextView) findViewById(R.id.numbers);
        TextView phrases_view = (TextView) findViewById(R.id.phrases);
        TextView family_view = (TextView) findViewById(R.id.family);
        TextView colors_view = (TextView) findViewById(R.id.colors);

        numbers_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbers_intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbers_intent);
            }
        });

        phrases_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases_intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrases_intent);
            }
        });

        colors_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors_intent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colors_intent);
            }
        });

        family_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family_intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(family_intent);
            }
        });

    }

    public void openNumbers(View view){
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }
}
