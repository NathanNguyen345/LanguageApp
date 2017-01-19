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
        wordList.add(new Word("One", "Một", R.drawable.number_one));
        wordList.add(new Word("Two", "Hai", R.drawable.number_two));
        wordList.add(new Word("Three", "Ba", R.drawable.number_three));
        wordList.add(new Word("Four", "Bốn", R.drawable.number_four));
        wordList.add(new Word("Five", "Năm", R.drawable.number_five));
        wordList.add(new Word("Six", "Sáu", R.drawable.number_six));
        wordList.add(new Word("Seven", "Bảy", R.drawable.number_seven));
        wordList.add(new Word("Eight", "Tám", R.drawable.number_eight));
        wordList.add(new Word("Nine", "Chín", R.drawable.number_nine));
        wordList.add(new Word("Ten", "Mười", R.drawable.number_ten));


        // Create Array Adapter for List
        WordAdapter<Word> adapter =
                new WordAdapter<Word>(this, wordList, R.color.numColor);

        // Create ListView object
        ListView myListView = (ListView) findViewById(R.id.numberListView);

        // Add the Array adapter into the ListView
        myListView.setAdapter(adapter);

    }

}
