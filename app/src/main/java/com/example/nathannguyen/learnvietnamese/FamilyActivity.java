package com.example.nathannguyen.learnvietnamese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_list_view);

        // Cereate the arrayList of words
        ArrayList<Word> familyList = new ArrayList<Word>();

        // Add elements to the arrayList
        familyList.add(new Word("Grandfather", "Ông"));
        familyList.add(new Word("GrandMother", "Bà"));
        familyList.add(new Word("Father", "Ba"));
        familyList.add(new Word("Mother", "Má"));
        familyList.add(new Word("Brother", "Anh"));
        familyList.add(new Word("Sister", "Chị"));
        familyList.add(new Word("Uncle", "Chú"));
        familyList.add(new Word("Aunt", "Cô"));
        familyList.add(new Word("Daughter", "Con Gái"));
        familyList.add(new Word("Son", "Con Trai"));

        // Create the word adapter
        WordAdapter<Word> familyAdapter = new WordAdapter<Word>(this, familyList);

        // Create listView for the familyList
        ListView familyView = (ListView) findViewById(R.id.familyListView);

        // Assign adapater to the listVIew
        familyView.setAdapter(familyAdapter);
    }
}
