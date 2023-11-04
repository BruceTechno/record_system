package com.example.record_system.vo.request;

public class AddCategoryRequest {
    private String userId;
    private String ctgFor;
    private String name;
//==

    public AddCategoryRequest() {
    }
//==

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCtgFor() {
        return ctgFor;
    }

    public void setCtgFor(String ctgFor) {
        this.ctgFor = ctgFor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
