package com.example.record_system.vo.request;

import javax.persistence.Column;
import java.time.LocalDate;

public class AddAccountingRequest {

    private String userId;    //暫時寫死 bruce
    private LocalDate date;
    private Integer categoryId;
    private Integer cost;
    private String thing;
    private boolean isRequire;
    private Integer incomeOrOutcome; //是收入還是支出
//==

    public AddAccountingRequest() {
    }
//==

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getIncomeOrOutcome() {
        return incomeOrOutcome;
    }

    public void setIncomeOrOutcome(Integer incomeOrOutcome) {
        this.incomeOrOutcome = incomeOrOutcome;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public boolean isRequire() {
        return isRequire;
    }

    public void setRequire(boolean require) {
        isRequire = require;
    }
}
