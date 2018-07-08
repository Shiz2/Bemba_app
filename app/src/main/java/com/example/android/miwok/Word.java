package com.example.android.miwok;

import android.content.Context;

public class Word {
    private String mbemba_translation;
    private String mdefault_translation;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mimage_id = NO_IMAGE_PROVIDED;

    public Word(Context context, String b_word, String d_word, int img_id){
        mbemba_translation = b_word;
        mdefault_translation = d_word;
        mimage_id = img_id;
    }

    public Word(Context context, String b_word, String d_word){
        mbemba_translation = b_word;
        mdefault_translation = d_word;
    }


    public String getBembaTranslation(){
        return mbemba_translation;
    }

    public String getDefaultTanslation(){
        return mdefault_translation;
    }

    public int getImageId(){return mimage_id; }

    public boolean hasImage(){ return mimage_id != NO_IMAGE_PROVIDED; }

}
