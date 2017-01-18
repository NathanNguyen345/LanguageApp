package com.example.nathannguyen.learnvietnamese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_list_view);

        // Create new arrayList
        ArrayList<Word> colorList = new ArrayList<Word>();

        // Add elements into our array list
        colorList.add(new Word("Black", "đen"));
        colorList.add(new Word("Blue", "Xanh"));
        colorList.add(new Word("Gray", "Xám"));
        colorList.add(new Word("Green", "Xanh Lá Cây"));
        colorList.add(new Word("Orange", "Cam"));
        colorList.add(new Word("Pink", "hồng"));
        colorList.add(new Word("Purple", "Tím"));
        colorList.add(new Word("Red", "đỏ"));
        colorList.add(new Word("White", "Trắng"));
        colorList.add(new Word("Yellow", "Vàng"));

        // Create a word adapter
        WordAdapter<Word> colorAdapter =
                new WordAdapter<Word>(this, colorList);

        // Create the listView
        ListView colorView = (ListView) findViewById(R.id.colorListView);

        // Set the adapter to the listView
        colorView.setAdapter(colorAdapter);
    }
}
