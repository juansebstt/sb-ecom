package com.ecommerce.sbecom.service.impl;

import com.ecommerce.sbecom.common.dto.CategoryDTO;
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
    public CategoryDTO createCategory(CategoryDTO category) {
        var categoryModel = CategoryModel.builder().categoryName(category.getCategoryName()).build();
        var created = Optional.of(categoryModel)
                .map(categoryRepository::save)
                .orElseThrow(() -> new RuntimeException("Failed to save category"));
        return CategoryDTO.builder()
                .id(created.getId())
                .categoryName(created.getCategoryName())
                .build();
    }

    @Override
    public CategoryDTO updateCategory(CategoryDTO updateCategory) {
        return null;
    }

    @Override
    public CategoryDTO deleteCategory(CategoryDTO deleteCategory) {
        return null;
    }
}
