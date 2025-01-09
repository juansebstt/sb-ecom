package com.ecommerce.sbecom.service.impl;

import com.ecommerce.sbecom.common.entity.CategoryModel;
import com.ecommerce.sbecom.service.PublicCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicCategoryServiceImpl implements PublicCategoryService {

    @Override
    public List<CategoryModel> getAllCategories() {
        return List.of();
    }
}
