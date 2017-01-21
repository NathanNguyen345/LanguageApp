package com.example.nathannguyen.learnvietnamese;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_list_view);

        // Create new arrayList
        final ArrayList<Word> colorList = new ArrayList<Word>();

        // Add elements into our array list
        colorList.add(new Word("Black", "đen", R.drawable.color_black, R.raw.black));
        colorList.add(new Word("Brown", "Xanh", R.drawable.color_brown, R.raw.brown));
        colorList.add(new Word("Gray", "Xám", R.drawable.color_gray, R.raw.gray));
        colorList.add(new Word("Green", "Xanh Lá Cây", R.drawable.color_green, R.raw.green));
        colorList.add(new Word("Red", "đỏ", R.drawable.color_red, R.raw.red));
        colorList.add(new Word("White", "Trắng", R.drawable.color_white, R.raw.white));
        colorList.add(new Word("Yellow", "Vàng", R.drawable.color_dusty_yellow, R.raw.yellow));

        // Create a word adapter
        final WordAdapter<Word> colorAdapter =
                new WordAdapter<Word>(this, colorList, R.color.colorColor);

        // Create the listView
        ListView colorView = (ListView) findViewById(R.id.colorListView);

        // Set the adapter to the listView
        colorView.setAdapter(colorAdapter);

        colorView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currentWordItem = colorList.get(position);

                mp = MediaPlayer.create(ColorActivity.this, currentWordItem.getSoundId());
                mp.start();
            }
        });
    }
}
