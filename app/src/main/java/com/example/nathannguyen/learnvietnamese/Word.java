package com.example.nathannguyen.learnvietnamese;

/** This is the word class that will be holding both English and Vietnamese words.
 * Created by nathan.nguyen on 1/15/17.
 */

public class Word  {

    // Variables
    private String engWord;
    private String vietWord;
    private int imageId = -1;


    // Constructor w/o img
    public Word(String eng, String viet){
        this.engWord = eng;
        this.vietWord = viet;
    }

    // Constructor w/ img
    public Word(String eng, String viet, int source){
        this.engWord = eng;
        this.vietWord = viet;
        this.imageId = source;
    }

    /**
     * Getter & Setter for variables
     */
    public String getVietWord() {
        return vietWord;
    }

    public String getEngWord() {
        return engWord;
    }

    public int getImageId() {
        return imageId;
    }

    public boolean hasImage(){
        return imageId != -1;
    }
}// end Word class
