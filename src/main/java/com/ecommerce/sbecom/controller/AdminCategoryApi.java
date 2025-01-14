package com.ecommerce.sbecom.controller;

import com.ecommerce.sbecom.common.constant.ApiPathConstant;
import com.ecommerce.sbecom.common.dto.CategoryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApiPathConstant.V1_ROUTE + ApiPathConstant.ADMIN_ROUTE + ApiPathConstant.CATEGORY_ROUTE)
public interface AdminCategoryApi {

    @PostMapping
    ResponseEntity<CategoryDTO> createCategory();

    @PutMapping("/{id}")
    ResponseEntity<CategoryDTO> updateCategory(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO);

    @DeleteMapping("/{id}")
    ResponseEntity<CategoryDTO> deleteCategory(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO);

}
