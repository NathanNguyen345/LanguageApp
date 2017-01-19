package com.example.nathannguyen.learnvietnamese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrase_list_view);

        // Create ArrayList of words
        ArrayList<Word> phraseList = new ArrayList<Word>();

        // Adding words into the adaptar
        phraseList.add(new Word("Vietnamese", "Tiếng Việt"));
        phraseList.add(new Word("Hello", "Xin Chào"));
        phraseList.add(new Word("Good bye", "Tạm Biệt"));
        phraseList.add(new Word("Yes", "Vâng"));
        phraseList.add(new Word("No", "Không"));
        phraseList.add(new Word("Thank you", "Cảm ơn"));
        phraseList.add(new Word("You're welcome", "Không Có Chi"));
        phraseList.add(new Word("Sorry", "Xin Lỗi"));
        phraseList.add(new Word("English", "Tiếng Anh"));
        phraseList.add(new Word("Please", "Làm ơn"));


        // Create Array Adapter for List
        WordAdapter<Word> adapter =
                new WordAdapter<Word>(this, phraseList, R.color.phraseColor);

        // Create ListView
        ListView myListView = (ListView) findViewById(R.id.phraseListView);

        // Add the Array adapter into the ListView
        myListView.setAdapter(adapter);
    }
}
