package com.example.record_system.service.impl;

import com.example.record_system.constants.RtnCode;
import com.example.record_system.entity.Category;
import com.example.record_system.repository.CategoryDao;
import com.example.record_system.service.ifs.CategoryService;
import com.example.record_system.vo.request.AddCategoryRequest;
import com.example.record_system.vo.response.AddCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public AddCategoryResponse addCtg(AddCategoryRequest request) {
        String userId = request.getUserId(); //todo 這個之後改用session抓
        String ctgFor = request.getCtgFor();
        String name = request.getName();
        //todo ++ session登入判斷
        if (!StringUtils.hasText(ctgFor) || !StringUtils.hasText(name)){
            return new AddCategoryResponse(RtnCode.CANNOT_EMPTY.getMessage());
        }
        int insertResult = categoryDao.insertCategoryWhereNotExists(userId,ctgFor,name);
        if(insertResult == 0){
            return new AddCategoryResponse(RtnCode.DATA_DUPLICATE.getMessage());
        }
        Category result = new Category(userId,ctgFor,name);
        return new AddCategoryResponse(RtnCode.SUCCESSFUL.getMessage(),result);
    }

    @Override
    public AddCategoryResponse getCtgByUser(AddCategoryRequest request) {
        String userId = request.getUserId();
        List<Category> result = categoryDao.findAllByUserId(userId);

        return new AddCategoryResponse(RtnCode.SUCCESSFUL.getMessage(),result);
    }
}
