package com.example.quakereport;

public class Word {
    private double mMagnitude;
    private String mPLace1;
    private String mPlace2;
    private String mdate;
    private String mTime;



    public Word(double Magnitude, String PLace1, String Place2,String date,String Time){
        mMagnitude = Magnitude;
        mPLace1 = PLace1;
        mPlace2 = Place2;
        mdate = date;
        mTime = Time;

    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmPLace1() {
        return mPLace1;
    }

    public String getmPlace2() {
        return mPlace2;
    }

    public String getMdate() {
        return mdate;
    }

    public String getmTime() {
        return mTime;
    }
}
