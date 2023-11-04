package com.example.record_system.controller;

import com.example.record_system.service.ifs.CategoryService;
import com.example.record_system.vo.request.AddCategoryRequest;
import com.example.record_system.vo.response.AddCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping(value = "add_ctg")
    public AddCategoryResponse addCtg(@RequestBody AddCategoryRequest request) {//todo ++ session
        return categoryService.addCtg(request);
    }
}
