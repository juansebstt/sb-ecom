package com.ecommerce.sbecom.controller.impl;

import com.ecommerce.sbecom.common.entity.CategoryModel;
import com.ecommerce.sbecom.controller.PublicCategoryApi;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PublicCategoryController implements PublicCategoryApi {


    @Override
    public ResponseEntity<List<CategoryModel>> getAllCategories() {
        return null;
    }
}
