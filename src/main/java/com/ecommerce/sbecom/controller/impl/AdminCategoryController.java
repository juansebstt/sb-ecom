package com.ecommerce.sbecom.controller.impl;

import com.ecommerce.sbecom.common.dto.CategoryDTO;
import com.ecommerce.sbecom.controller.AdminCategoryApi;
import com.ecommerce.sbecom.service.AdminCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

// Controller implementation for handling category requests by admin
@RestController
public class AdminCategoryController implements AdminCategoryApi {

    // Service dependency
    private final AdminCategoryService adminCategoryService;

    // Constructor-based dependency injection
    @Autowired
    public AdminCategoryController(AdminCategoryService adminCategoryService) {
        this.adminCategoryService = adminCategoryService;
    }

    // Placeholder for handling POST requests to create a category
    @Override
    public ResponseEntity<CategoryDTO> createCategory(CategoryDTO category) {
        return ResponseEntity.ok(adminCategoryService.createCategory(category));
    }

    // Placeholder for handling PUT requests to update a category
    @Override
    public ResponseEntity<CategoryDTO> updateCategory(Long id, CategoryDTO categoryDTO) {
        return ResponseEntity.ok(adminCategoryService.updateCategory(categoryDTO));
    }

    // Placeholder for handling DELETE requests to delete a category
    @Override
    public ResponseEntity<Void> deleteCategory(Long id) {
        return ResponseEntity.noContent().build();
    }
}
