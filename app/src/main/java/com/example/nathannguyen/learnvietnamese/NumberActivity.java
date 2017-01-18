package com.example.nathannguyen.learnvietnamese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_list_view);

        // Create ArrayList of words
        ArrayList<Word> wordList = new ArrayList<Word>();

        // Adding words into the adaptar
        wordList.add(new Word("One", "Một"));
        wordList.add(new Word("Two", "Hai"));
        wordList.add(new Word("Three", "Ba"));
        wordList.add(new Word("Four", "Bốn"));
        wordList.add(new Word("Five", "Năm"));
        wordList.add(new Word("Six", "Sáu"));
        wordList.add(new Word("Seven", "Bảy"));
        wordList.add(new Word("Eight", "Tám"));
        wordList.add(new Word("Nine", "Chín"));
        wordList.add(new Word("Ten", "Mười"));


        // Create Array Adapter for List
        WordAdapter<Word> adapter =
                new WordAdapter<Word>(this, wordList);

        // Create ListView object
        ListView myListView = (ListView) findViewById(R.id.numberListView);

        // Add the Array adapter into the ListView
        myListView.setAdapter(adapter);

    }

}
