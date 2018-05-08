package com.example.grazy.tourguideapp;

/**
 * {@link Places} represents a list of places in Armacao de Pera - Portugal that the user would like to visit.
 */
public class Places {

    /**
     * Name of the place
     */
    private int mPlaceName;

    /**
     * Image resource ID for the place
     */
    private int mImageResourceId;

    /**
     * Create a new Places object.
     * *
     *
     * @param placeName       is the name of the place that the user would like to visit.
     * @param imageResourceId is the image of the place
     */
    public Places(int placeName, int imageResourceId) {
        mPlaceName = placeName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public int getPlaceName() {

        return mPlaceName;
    }

    /**
     * Get the image resource ID of the place.
     */
    public int getImageResourceId() {

        return mImageResourceId;
    }
}