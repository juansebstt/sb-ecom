package com.ecommerce.sbecom.service;

import com.ecommerce.sbecom.common.dto.CategoryDTO;

public interface AdminCategoryService {

    CategoryDTO createCategory(CategoryDTO category);

    CategoryDTO updateCategory(CategoryDTO updateCategory);

    void deleteCategory(Long categoryId);
}
