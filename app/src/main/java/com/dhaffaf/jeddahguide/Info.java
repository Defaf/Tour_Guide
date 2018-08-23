package com.dhaffaf.jeddahguide;

/**
 * Created by WIN8 on 25/12/17.
 */

public class Info {
    //Locations varivle
    private int  placeName;
    private int aboutPlace;
    private int placeImage;

    /**
     *
     * @param placeName is the location name
     * @param aboutPlace discription of location
     * @param placeImage location photo
     */

    public Info(int placeName, int aboutPlace, int placeImage) {
        this.placeName = placeName;
        this.aboutPlace = aboutPlace;
        this.placeImage = placeImage;
    }
    //get the place name
    public int getPlaceName() {
        return placeName;
    }
    //get the place discription
    public int getAboutPlace() {
        return aboutPlace;
    }
    //get the place image
    public int getPlaceImage() {
        return placeImage;
    }
}
