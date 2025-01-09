package com.ecommerce.sbecom.controller.impl;

import com.ecommerce.sbecom.common.entity.CategoryModel;
import com.ecommerce.sbecom.controller.PublicCategoryApi;
import com.ecommerce.sbecom.service.PublicCategoryService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PublicCategoryController implements PublicCategoryApi {

    private final PublicCategoryService publicCategoryService;

    public PublicCategoryController(PublicCategoryService publicCategoryService) {

        this.publicCategoryService = publicCategoryService;
    }

    @Override
    public ResponseEntity<List<CategoryModel>> getAllCategories() {
        return ResponseEntity.ok(publicCategoryService.getAllCategories());
    }
}
