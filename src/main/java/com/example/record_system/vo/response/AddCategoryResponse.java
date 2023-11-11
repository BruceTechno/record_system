package com.example.record_system.vo.response;

import com.example.record_system.entity.Category;

import java.util.List;

public class AddCategoryResponse {
    private String message;
    private Category category;
    private List<Category> categoryList;
//==

    public AddCategoryResponse() {
    }

    public AddCategoryResponse(String message, List<Category> categoryList) {
        this.message = message;
        this.categoryList = categoryList;
    }

    public AddCategoryResponse(String message) {
        this.message = message;
    }

    public AddCategoryResponse(String message, Category category) {
        this.message = message;
        this.category = category;
    }
//==

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
