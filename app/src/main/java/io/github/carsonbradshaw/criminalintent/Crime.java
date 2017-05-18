package io.github.carsonbradshaw.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Carson on 5/13/2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private String mSuspect;
    private Date mDate;

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    private boolean mSolved;
    private boolean mRequiresPolice;

    public Crime(){
        this(UUID.randomUUID());
    }

    public UUID getId() {
        return mId;
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public boolean isRequiresPolice() {
        return mRequiresPolice;
    }

    public void setRequiresPolice(boolean requiresPolice) {
        mRequiresPolice = requiresPolice;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }
}
