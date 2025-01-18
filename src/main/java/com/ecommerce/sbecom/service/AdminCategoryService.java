package com.ecommerce.sbecom.service;

import com.ecommerce.sbecom.common.dto.CategoryDTO;

public interface AdminCategoryService {

    CategoryDTO createCategory(CategoryDTO category);

    CategoryDTO updateCategory(CategoryDTO updateCategory);

    CategoryDTO deleteCategory(CategoryDTO deleteCategory);


}
