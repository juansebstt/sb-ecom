package com.ecommerce.sbecom.service.impl;

import com.ecommerce.sbecom.common.entity.CategoryModel;
import com.ecommerce.sbecom.repository.CategoryRepository;
import com.ecommerce.sbecom.service.AdminCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminCategoryServiceImpl implements AdminCategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public AdminCategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryModel createCategory(CategoryModel categoryModel) {
        var category = CategoryModel.builder().categoryName(categoryModel.getCategoryName()).build();
        var created = Optional.of(category)
                .map(categoryRepository::save)
                .orElseThrow(() -> new RuntimeException("Failed to save category"));
        return CategoryModel.builder()
                .categoryId(created.getCategoryId())
                .categoryName(created.getCategoryName())
                .build();

}
