/********************************************************************************************************
 * This is out number screen activty page.  It declares a private media player. Once the page is created,
 * we call create a custome arrayList of word objects that we pass in information for the family page.
 * We then set the activity up with ListView adapter.
 * Created By: Nathan Nguyen
 * Date: 1/15/17
 ********************************************************************************************************/

package com.example.nathannguyen.learnvietnamese;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    // create a media player
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_list_view);

        // Create ArrayList of words
        final ArrayList<Word> wordList = new ArrayList<Word>();

        // Adding words into the adaptar
        wordList.add(new Word("One", "Một", R.drawable.number_one, R.raw.one));
        wordList.add(new Word("Two", "Hai", R.drawable.number_two, R.raw.two));
        wordList.add(new Word("Three", "Ba", R.drawable.number_three, R.raw.three));
        wordList.add(new Word("Four", "Bốn", R.drawable.number_four, R.raw.four));
        wordList.add(new Word("Five", "Năm", R.drawable.number_five, R.raw.five));
        wordList.add(new Word("Six", "Sáu", R.drawable.number_six, R.raw.six));
        wordList.add(new Word("Seven", "Bảy", R.drawable.number_seven, R.raw.seven));
        wordList.add(new Word("Eight", "Tám", R.drawable.number_eight, R.raw.eight));
        wordList.add(new Word("Nine", "Chín", R.drawable.number_nine, R.raw.nine));
        wordList.add(new Word("Ten", "Mười", R.drawable.number_ten, R.raw.ten));


        // Create Array Adapter for List
        WordAdapter<Word> adapter =
                new WordAdapter<Word>(this, wordList, R.color.numColor);

        // Create ListView object
        ListView myListView = (ListView) findViewById(R.id.numberListView);

        // Add the Array adapter into the ListView
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currentWordItem = wordList.get(position);

                mp = MediaPlayer.create(NumberActivity.this, currentWordItem.getSoundId());
                mp.start();

                // Release the resource after the audio is done playing
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

    }// end onCreate

    @Override
    protected void onStop() {
        super.onStop();

        // Stop audio playback and release to free memory
        mp.stop();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }// end onStop

}// end activity
