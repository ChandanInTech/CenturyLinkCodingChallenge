package com.example.centurylinkcodingchallenge.model;

public class RvItemPOJO {
    int imageID;
    String title;
    String id;
    String availability;
    int availabilityIcon;

    public RvItemPOJO(String id, String availability) {
        //this.imageID = imageID;
        //this.title = title;
        this.id = id;
        this.availability = availability;
        //this.availabilityIcon = availabilityIcon;
    }

    public int getImageID() {
        return imageID;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getAvailability() {
        return availability;
    }

    public int getAvailabilityIcon() {
        return availabilityIcon;
    }
}
