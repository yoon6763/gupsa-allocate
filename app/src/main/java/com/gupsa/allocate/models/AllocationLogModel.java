package com.gupsa.allocate.models;

public class AllocationLogModel {
    String company;
    String date;
    String location;
    float weight;
    int point;

    public AllocationLogModel(String company, String date, String location, float weight, int point) {
        this.company = company;
        this.date = date;
        this.location = location;
        this.weight = weight;
        this.point = point;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
