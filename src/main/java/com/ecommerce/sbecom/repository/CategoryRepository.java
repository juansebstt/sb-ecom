package com.ecommerce.sbecom.repository;

import com.ecommerce.sbecom.common.entity.CategoryModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {
}
