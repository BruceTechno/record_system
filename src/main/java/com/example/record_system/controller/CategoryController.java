package com.example.record_system.controller;

import com.example.record_system.service.ifs.CategoryService;
import com.example.record_system.vo.request.AddCategoryRequest;
import com.example.record_system.vo.response.AddCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping(value = "add_ctg")
    public AddCategoryResponse addCtg(@RequestBody AddCategoryRequest request) {//todo ++ session
        return categoryService.addCtg(request);
    }
    @PostMapping(value = "ctg_by_user_and_ctgFor")
    public AddCategoryResponse getCtgByUserAndCtgFor(@RequestBody AddCategoryRequest request) {
        return categoryService.getCtgByUserAndCtgFor(request);
    }
}
