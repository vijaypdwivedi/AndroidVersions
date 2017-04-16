package com.iccdetector.androidversions;

/**
 * Created by Vijay on 4/16/2017.
 */

public class AndroidVersion  {

    private String androidName;
    private String androidVersion;
    private int androidLogo;

    public AndroidVersion(String androidName, String androidVersion, int androidLogo){

        this.androidName = androidName;
        this.androidVersion =androidVersion;
        this.androidLogo = androidLogo;

    }

    public String getAndroidName(){

        return androidName;
    }

    public String getAndroidVersion(){

        return androidVersion;
    }

    public int getAndroidLogo(){

        return androidLogo;
    }

}
