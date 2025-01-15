package com.ecommerce.sbecom.controller.impl;

import com.ecommerce.sbecom.common.dto.CategoryDTO;
import com.ecommerce.sbecom.controller.AdminCategoryApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminCategoryController implements AdminCategoryApi {

    @Override
    public ResponseEntity<CategoryDTO> createCategory() {
        return ResponseEntity.ok();
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
