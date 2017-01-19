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
        colorList.add(new Word("Black", "đen", R.drawable.color_black));
        colorList.add(new Word("Brown", "Xanh", R.drawable.color_brown));
        colorList.add(new Word("Gray", "Xám", R.drawable.color_gray));
        colorList.add(new Word("Green", "Xanh Lá Cây", R.drawable.color_green));
        colorList.add(new Word("Red", "đỏ", R.drawable.color_red));
        colorList.add(new Word("White", "Trắng", R.drawable.color_white));
        colorList.add(new Word("Yellow", "Vàng", R.drawable.color_dusty_yellow));

        // Create a word adapter
        WordAdapter<Word> colorAdapter =
                new WordAdapter<Word>(this, colorList, R.color.colorColor);

        // Create the listView
        ListView colorView = (ListView) findViewById(R.id.colorListView);

        // Set the adapter to the listView
        colorView.setAdapter(colorAdapter);
    }
}
