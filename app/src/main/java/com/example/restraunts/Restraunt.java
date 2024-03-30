package com.example.restraunts;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Restraunt implements Parcelable {
    private String restrauntName;
    private String restrauntContact;
    private String restrauntLocation;
    private String restrauntDescription;

    private String rating;

    public Restraunt(String restrauntName, String restrauntContact, String restrauntLocation, String restrauntDescription, String rating) {
        this.restrauntName = restrauntName;
        this.restrauntContact = restrauntContact;
        this.restrauntLocation = restrauntLocation;
        this.restrauntDescription = restrauntDescription;
        this.rating = rating;
    }

    public static final Creator<Restraunt> CREATOR = new Creator<Restraunt>() {
        @Override
        public Restraunt createFromParcel(Parcel in) {
            return new Restraunt(in);
        }

        @Override
        public Restraunt[] newArray(int size) {
            return new Restraunt[size];
        }
    };

    public Restraunt() {

    }

    public String getRestrauntName() {
        return restrauntName;
    }

    public void setRestrauntName(String restrauntName) {
        this.restrauntName = restrauntName;
    }

    public String getRestrauntContact() {
        return restrauntContact;
    }

    public void setRestrauntContact(String restrauntContact) {
        this.restrauntContact = restrauntContact;
    }

    public String getRestrauntLocation() {
        return restrauntLocation;
    }

    public void setRestrauntLocation(String restrauntLocation) {
        this.restrauntLocation = restrauntLocation;
    }

    public String getRestrauntDescription() {
        return restrauntDescription;
    }

    public void setRestrauntDescription(String restrauntDescription) {
        this.restrauntDescription = restrauntDescription;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    protected Restraunt(Parcel in) {
        restrauntName = in.readString();
        restrauntContact = in.readString();
        restrauntLocation = in.readString();
        restrauntDescription = in.readString();
        rating = in.readString();
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(restrauntName);
        parcel.writeString(restrauntContact);
        parcel.writeString(restrauntLocation);
        parcel.writeString(restrauntDescription);
        parcel.writeString(rating);
    }
}
