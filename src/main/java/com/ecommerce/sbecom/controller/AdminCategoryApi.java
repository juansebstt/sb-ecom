package com.ecommerce.sbecom.controller;

import com.ecommerce.sbecom.common.constant.ApiPathConstant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ApiPathConstant.V1_ROUTE + ApiPathConstant.ADMIN_ROUTE + ApiPathConstant.CATEGORY_ROUTE)
public interface AdminCategoryApi {

    @PostMapping
    ResponseEntity<?> createCategory();

    @DeleteMapping
    ResponseEntity<?> deleteCategory();

}
