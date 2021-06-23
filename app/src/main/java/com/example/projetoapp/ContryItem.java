package com.example.projetoapp;

public class ContryItem {
    private String mContryName;
    private int mFlagImage;

    public ContryItem(String contryName, int flagImage){
        mContryName = contryName;
        mFlagImage = flagImage;
    }

    public String getContryName() {
        return mContryName;
    }
    public int getFlagImage(){
        return mFlagImage;
    }
}
