package com.ecommerce.sbecom.controller;

import com.ecommerce.sbecom.common.constant.ApiPathConstant;
import com.ecommerce.sbecom.common.entity.CategoryModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(ApiPathConstant.V1_ROUTE + ApiPathConstant.PUBLIC_ROUTE + ApiPathConstant.CATEGORIES_ROUTE)
public interface PublicCategoryApi {

    @GetMapping
    ResponseEntity<List<CategoryModel>> getAllCategories();

}
