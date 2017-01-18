package com.example.nathannguyen.learnvietnamese;

/** This is the word class that will be holding both English and Vietnamese words.
 * Created by nathan.nguyen on 1/15/17.
 */

public class Word  {

    // Variables
    private String engWord;
    private String vietWord;


    // Constructor
    public Word(String eng, String viet){
        this.engWord = eng;
        this.vietWord = viet;
    }

    /**
     * Getter & Setter for variables
     */
    public String getVietWord() {
        return vietWord;
    }

    public void setVietWord(String vietWord) {
        this.vietWord = vietWord;
    }

    public String getEngWord() {
        return engWord;
    }

    public void setEngWord(String engWord) {
        this.engWord = engWord;
    }

}// end Word class
