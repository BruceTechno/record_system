package com.example.record_system.service.ifs;

import com.example.record_system.vo.request.AddCategoryRequest;
import com.example.record_system.vo.response.AddCategoryResponse;

public interface CategoryService {
    public AddCategoryResponse addCtg (AddCategoryRequest request);
    public AddCategoryResponse getCtgByUserAndCtgFor(AddCategoryRequest request);
}
