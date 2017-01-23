/********************************************************************************************************
 * This is the word class that will be holding both English and Vietnamese words.
 * Created by: Nathan Nguyem
 * Date: 1/15/17.
 ********************************************************************************************************/
package com.example.nathannguyen.learnvietnamese;


public class Word  {

    // Variables
    private String engWord;
    private String vietWord;
    private int imageId = -1;
    private int soundId = -1;


    // Constructor w/o img
    public Word(String eng, String viet){
        this.engWord = eng;
        this.vietWord = viet;
    }

    // Constructor w/o img
    public Word(String eng, String viet, int sound, boolean image){
        this.engWord = eng;
        this.vietWord = viet;
        this.soundId = sound;
    }

    // Constructor w/ img
    public Word(String eng, String viet, int source){
        this.engWord = eng;
        this.vietWord = viet;
        this.imageId = source;
    }

    // Constructor w/ img
    public Word(String eng, String viet, int source, int sound){
        this.engWord = eng;
        this.vietWord = viet;
        this.imageId = source;
        this.soundId = sound;
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

    public int getSoundId() {
        return soundId;
    }
}// end Word class
