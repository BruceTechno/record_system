package com.example.record_system.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Entity
@Table(name = "accounting")
public class  Accounting {
    // 記帳 金錢相關

    // id 、category 、thing(做了什麼)、cost(花費金額)、date(哪天花的)、isRequire 、 income OR outcome
    @Id
    @Column(name = "ID")
//    @GeneratedValue(strategy = )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "CATEGORY_ID")
    private Integer categoryId;
    @Column(name = "THING")
    private String thing;
    @Column(name = "COST")
    private Integer cost;
    @Column(name = "DATE")
    private String date ;
    @Column(name = "YNREQUIRE")
    private String ynRequire;
    @Column(name = "IN_OUTCOME")
    private Integer incomeOrOutcome; //是收入還是支出
//==

    public Accounting() {
    }

    public Accounting(String userId, Integer categoryId, String thing, Integer cost, String date, String ynRequire, Integer incomeOrOutcome) {
        this.userId = userId;
        this.categoryId = categoryId;
        this.thing = thing;
        this.cost = cost;
        this.date = date;
        this.ynRequire = ynRequire;
        this.incomeOrOutcome = incomeOrOutcome;
    }
//==

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getYnRequire() {
        return ynRequire;
    }

    public void setYnRequire(String ynRequire) {
        this.ynRequire = ynRequire;
    }

    public Integer getIncomeOrOutcome() {
        return incomeOrOutcome;
    }

    public void setIncomeOrOutcome(Integer incomeOrOutcome) {
        this.incomeOrOutcome = incomeOrOutcome;
    }
}
