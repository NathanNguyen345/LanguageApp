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
        familyList.add(new Word("Grandfather", "Ông", R.drawable.family_grandfather));
        familyList.add(new Word("GrandMother", "Bà", R.drawable.family_grandmother));
        familyList.add(new Word("Father", "Ba", R.drawable.family_father));
        familyList.add(new Word("Mother", "Má", R.drawable.family_mother));
        familyList.add(new Word("Brother", "Anh", R.drawable.family_son));
        familyList.add(new Word("Sister", "Chị", R.drawable.family_daughter));
        familyList.add(new Word("Uncle", "Chú", R.drawable.family_older_brother));
        familyList.add(new Word("Aunt", "Cô", R.drawable.family_older_sister));
        familyList.add(new Word("Daughter", "Con Gái", R.drawable.family_younger_sister));
        familyList.add(new Word("Son", "Con Trai", R.drawable.family_younger_brother));

        // Create the word adapter
        WordAdapter<Word> familyAdapter = new WordAdapter<Word>(this, familyList);

        // Create listView for the familyList
        ListView familyView = (ListView) findViewById(R.id.familyListView);

        // Assign adapater to the listVIew
        familyView.setAdapter(familyAdapter);
    }
}
