package com.ecommerce.sbecom.controller;

import com.ecommerce.sbecom.common.constant.ApiPathConstant;
import com.ecommerce.sbecom.common.dto.CategoriesDTO;
import com.ecommerce.sbecom.common.entity.CategoryModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// Public API for handling category requests
@RequestMapping(ApiPathConstant.V1_ROUTE + ApiPathConstant.PUBLIC_ROUTE + ApiPathConstant.CATEGORIES_ROUTE)
public interface PublicCategoryApi {

    // Placeholder for handling GET requests to retrieve all categories with pagination and sorting
    @GetMapping
    ResponseEntity<List<CategoryModel>> getAllCategories(@RequestBody CategoriesDTO pageNumber,
                     @RequestBody CategoriesDTO pageSize,
                     @RequestBody CategoriesDTO sortOrder,
                     @RequestBody CategoriesDTO sortType);

}
