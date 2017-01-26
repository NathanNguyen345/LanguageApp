/********************************************************************************************************
 * This is out family screen activty page.  It declares a private media player. Once the page is created,
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


public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_list_view);

        // Cereate the arrayList of words
        final ArrayList<Word> familyList = new ArrayList<Word>();

        // Add elements to the arrayList
        familyList.add(new Word("Grandfather", "Ông", R.drawable.family_grandfather, R.raw.gradpa));
        familyList.add(new Word("GrandMother", "Bà", R.drawable.family_grandmother, R.raw.grandma));
        familyList.add(new Word("Father", "Ba", R.drawable.family_father, R.raw.father));
        familyList.add(new Word("Mother", "Mẹ", R.drawable.family_mother, R.raw.mother));
        familyList.add(new Word("Brother", "Anh trai", R.drawable.family_son, R.raw.brother));
        familyList.add(new Word("Sister", "Chị gái", R.drawable.family_daughter, R.raw.sister));
        familyList.add(new Word("Husband", "Chồng", R.drawable.family_older_brother, R.raw.husband));
        familyList.add(new Word("Wife", "Vợ", R.drawable.family_older_sister, R.raw.wife));
        familyList.add(new Word("Daughter", "Con Gái", R.drawable.family_younger_sister, R.raw.daughter));
        familyList.add(new Word("Son", "Con Trai", R.drawable.family_younger_brother, R.raw.son));

        // Create the word adapter
        WordAdapter<Word> familyAdapter = new WordAdapter<Word>(this, familyList, R.color.famColor);

        // Create listView for the familyList
        ListView familyView = (ListView) findViewById(R.id.familyListView);

        // Assign adapter to the listVIew
        familyView.setAdapter(familyAdapter);

        // This will call the onItemClick to play the sound of each list
        familyView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currentWordItem = familyList.get(position);

                mp = MediaPlayer.create(FamilyActivity.this, currentWordItem.getSoundId());
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


        // This section has a bug

/*        mp.stop();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });*/


    }// end onStop

}// end activty
