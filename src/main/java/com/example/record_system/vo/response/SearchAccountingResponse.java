package com.example.record_system.vo.response;

import com.example.record_system.entity.Accounting;

import java.time.LocalDate;
import java.util.List;

public class SearchAccountingResponse {
    private String message;
    String userId;
    private String ctgNam;
    private String thing;
    private Integer cost;
    private LocalDate date;
    private String ynRequired;

//==

    public SearchAccountingResponse() {
    }

    public SearchAccountingResponse(String message) {
        this.message = message;
    }

    public SearchAccountingResponse(String message, String userId, String ctgNam, String thing, Integer cost, LocalDate date, String ynRequiredl) {
        this.message = message;
        this.userId = userId;
        this.ctgNam = ctgNam;
        this.thing = thing;
        this.cost = cost;
        this.date = date;
        this.ynRequired = ynRequiredl;
    }

    public SearchAccountingResponse(String userId, String ctgNam, String thing, Integer cost, LocalDate date, String ynRequiredl) {
        this.userId = userId;
        this.ctgNam = ctgNam;
        this.thing = thing;
        this.cost = cost;
        this.date = date;
        this.ynRequired = ynRequiredl;
    }
    //==

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getYnRequired() {
        return ynRequired;
    }

    public void setYnRequired(String ynRequired) {
        this.ynRequired = ynRequired;
    }

    public String getCtgNam() {
        return ctgNam;
    }

    public void setCtgNam(String ctgNam) {
        this.ctgNam = ctgNam;
    }
}
