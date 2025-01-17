package com.ecommerce.sbecom.service.impl;

import com.ecommerce.sbecom.common.dto.CategoriesDTO;
import com.ecommerce.sbecom.repository.CategoryRepository;
import com.ecommerce.sbecom.service.PublicCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicCategoryServiceImpl implements PublicCategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public PublicCategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoriesDTO> getAllCategories() {

        var categories = categoryRepository.findAll()
                .stream()
                .filter()

        return List.of();
    }
}
