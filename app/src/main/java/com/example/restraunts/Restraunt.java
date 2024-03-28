package com.example.restraunts;

public class Restraunt {
    private String restrauntName;
    private String restrauntContact;
    private String restrauntLocation;
    private String restrauntDescription;

    public Restraunt(String restrauntName, String restrauntContact, String restrauntLocation, String restrauntDescription) {
        this.restrauntName = restrauntName;
        this.restrauntContact = restrauntContact;
        this.restrauntLocation = restrauntLocation;
        this.restrauntDescription = restrauntDescription;
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
}
