package com.example.record_system.vo.request;

import java.time.LocalDate;

public class SearchAccountingRequest {
    String dateS;
    String dateE;
    int ctgId;
    int cost;
    String ynRequired;
    String thing;
//==


    public SearchAccountingRequest() {
    }
//==

    public String getDateS() {
        return dateS;
    }

    public void setDateS(String dateS) {
        this.dateS = dateS;
    }

    public String getDateE() {
        return dateE;
    }

    public void setDateE(String dateE) {
        this.dateE = dateE;
    }

    public int getCtgId() {
        return ctgId;
    }

    public void setCtgId(int ctgId) {
        this.ctgId = ctgId;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getYnRequired() {
        return ynRequired;
    }

    public void setYnRequired(String ynRequired) {
        this.ynRequired = ynRequired;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }
}
