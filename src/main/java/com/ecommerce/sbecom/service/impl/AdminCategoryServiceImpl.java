package com.ecommerce.sbecom.service.impl;

import com.ecommerce.sbecom.common.entity.CategoryModel;
import com.ecommerce.sbecom.repository.CategoryRepository;
import com.ecommerce.sbecom.service.AdminCategoryService;
import org.springframework.stereotype.Service;

@Service
public class AdminCategoryServiceImpl implements AdminCategoryService {

    private final CategoryRepository categoryRepository;

    public AdminCategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryModel createCategory(CategoryModel categoryModel) {
        return null;
    }
}
