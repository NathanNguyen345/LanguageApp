package com.example.nathannguyen.learnvietnamese;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Another way to modify setOnClickListener
//        TextView myView = (TextView) findViewById(R.id.number);
//
//        myView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, NumberActivity.class);
//                startActivity(i);
//            }
//        });



    }

    /**
     * This method will decide which activity screen will be opem
     */
    public void menuList(View view){
        Intent i = null;

        switch (view.getId()){
            case R.id.number:
                i = new Intent(this, NumberActivity.class);
                break;
            case  R.id.family:
                i = new Intent(this, FamilyActivity.class);
                break;
            case R.id.color:
                i = new Intent(this, ColorActivity.class);
                break;
            case R.id.phrase:
                i = new Intent(this, PhraseActivity.class);
                break;
            default:
        } // end switch statement

        startActivity(i);

    }// end menuList method
}
