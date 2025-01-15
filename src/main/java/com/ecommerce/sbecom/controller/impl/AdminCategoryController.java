package com.ecommerce.sbecom.controller.impl;

import com.ecommerce.sbecom.common.dto.CategoryDTO;
import com.ecommerce.sbecom.controller.AdminCategoryApi;
import com.ecommerce.sbecom.service.AdminCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminCategoryController implements AdminCategoryApi {

    private final AdminCategoryService adminCategoryService;

    @Autowired
    public AdminCategoryController(AdminCategoryService adminCategoryService) {
        this.adminCategoryService = adminCategoryService;
    }

    @Override
    public ResponseEntity<CategoryDTO> createCategory(CategoryDTO category) {
        return ResponseEntity.ok(adminCategoryService.createCategory(category));
    }

    @Override
    public ResponseEntity<CategoryDTO> updateCategory(Long id, CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryDTO> deleteCategory(Long id, CategoryDTO categoryDTO) {
        return null;
    }
}
