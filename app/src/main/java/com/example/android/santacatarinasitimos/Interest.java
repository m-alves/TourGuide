package com.example.android.santacatarinasitimos;

/**
 * Created by Utilizador on 02/06/2017.
 */

/**
 * {@link Interest} represents a point of interest.
 * It contains a name, a description, distance to village, a contact and an image for that point of interest.
 */
public class Interest {

    /** Name */
    private int mNameResourceId;

    /** Description */
    private int mDescriptionResourceId;

    /** Distance */
    private int mDistanceResourceId = NO_DISTANCE_PROVIDED;

    /** Constant value that represents no distance was provided for this point of interest */
    private static final int NO_DISTANCE_PROVIDED = -1;

    /** Contact */
    private int mContactResourceId = NO_CONTACT_PROVIDED;

    /** Constant value that represents no contact was provided for this point of interest */
    private static final int NO_CONTACT_PROVIDED = -1;


    /** Image resource ID for the Point of Interest */
    private int mImageResourceId;


    /**
     * Create a new Interest object.
     *
     * @param nameResourceId is the string resource ID for the name associated with the Point of Interest.
     * @param descriptionResourceId is the string resource ID for the description associated with the Point of Interest.
     * @param distanceResourceId is the string resource ID for the distance associated with the Point of Interest
     * @param contactResourceId is the string resource ID for the contact associated with the Point of Interest
     * @param imageResourceId is the drawable resource ID for the image associated with the Point of Interest
     */
    public Interest(int nameResourceId, int descriptionResourceId, int distanceResourceId, int contactResourceId, int imageResourceId) {
        mNameResourceId = nameResourceId;
        mDescriptionResourceId = descriptionResourceId;
        mDistanceResourceId = distanceResourceId;
        mContactResourceId = contactResourceId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Interest object.
     *
     *  is the string resource ID for the name associated with the Point of Interest.
     * @param descriptionResourceId is the string resource ID for the description associated with the Point of Interest.
     * @param contactResourceId is the string resource ID for the contact associated with the Point of Interest
     * @param imageResourceId is the drawable resource ID for the image associated with the Point of Interest
     */
    public Interest (int NameResourceId, int descriptionResourceId, int contactResourceId, int imageResourceId) {
        mNameResourceId = NameResourceId;
        mDescriptionResourceId = descriptionResourceId;
        mContactResourceId = contactResourceId;
        mImageResourceId = imageResourceId;

        //
    }


    /**
     * Create a new Interest object.
     *
     * @param nameResourceId is the string resource ID for the name associated with the Point of Interest.
     * @param descriptionResourceId is the string resource ID for the description associated with the Point of Interest.
     * @param imageResourceId is the drawable resource ID for the image associated with the Point of Interest
     */
    public Interest (int nameResourceId, int descriptionResourceId, int imageResourceId) {
        mNameResourceId = nameResourceId;
        mDescriptionResourceId = descriptionResourceId;
        mImageResourceId = imageResourceId;
    }

   /* *//**
     * Create a new Interest object.
     *
     * @param nameResourceId is the string resource ID for the name associated with the Point of Interest.
     *//*
    public Interest (int nameResourceId) {
        mNameResourceId = nameResourceId;
    }
*/



    /**
     * Return the name resource ID of the Interest.
     */
    public int getNameResourceId() {
        return mNameResourceId;
    }


    /**
     * Return the description resource ID of the Interest.
     */
    public int getDescriptionResourceId() {
        return mDescriptionResourceId;
    }

    /**
     * Return the distance resource ID of the Interest.
     */
    public int getDistanceResourceId() {
        return mDistanceResourceId;
    }

    /**
     * Return the contact resource ID of the Interest.
     */
    public int getContactResourceId() {
        return mContactResourceId;
    }

    /**
     * Return the image resource ID of the Interest.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is distance for this Interest.
     */
    public boolean hasDistance() {
        return mDistanceResourceId != NO_DISTANCE_PROVIDED;
    }

    /**
     * Returns whether or not there is contact for this Interest.
     */
    public boolean hasContact() {
        return mContactResourceId != NO_CONTACT_PROVIDED;
    }

}