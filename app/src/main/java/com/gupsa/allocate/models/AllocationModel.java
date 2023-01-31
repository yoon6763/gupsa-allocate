package com.gupsa.allocate.models;

import com.google.firebase.Timestamp;

public class AllocationModel {
    String company;
    String employee; // nullable
    String clientCompany;
    String clientName;
    String clientCall;
    String locationStart;
    String locationEnd;
    Timestamp durationStart;
    Timestamp durationEnd;
    String status;
    int point;
    float weight;

    public AllocationModel(String company, String employee, String clientCompany, String clientName, String clientCall, String locationStart, String locationEnd, Timestamp durationStart, Timestamp durationEnd, String status, int point, float weight) {
        this.company = company;
        this.employee = employee;
        this.clientCompany = clientCompany;
        this.clientName = clientName;
        this.clientCall = clientCall;
        this.locationStart = locationStart;
        this.locationEnd = locationEnd;
        this.durationStart = durationStart;
        this.durationEnd = durationEnd;
        this.status = status;
        this.point = point;
        this.weight = weight;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getClientCompany() {
        return clientCompany;
    }

    public void setClientCompany(String clientCompany) {
        this.clientCompany = clientCompany;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientCall() {
        return clientCall;
    }

    public void setClientCall(String clientCall) {
        this.clientCall = clientCall;
    }

    public String getLocationStart() {
        return locationStart;
    }

    public void setLocationStart(String locationStart) {
        this.locationStart = locationStart;
    }

    public String getLocationEnd() {
        return locationEnd;
    }

    public void setLocationEnd(String locationEnd) {
        this.locationEnd = locationEnd;
    }

    public Timestamp getDurationStart() {
        return durationStart;
    }

    public void setDurationStart(Timestamp durationStart) {
        this.durationStart = durationStart;
    }

    public Timestamp getDurationEnd() {
        return durationEnd;
    }

    public void setDurationEnd(Timestamp durationEnd) {
        this.durationEnd = durationEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
