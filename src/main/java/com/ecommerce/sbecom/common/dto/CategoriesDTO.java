package com.ecommerce.sbecom.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoriesDTO {

    private String pageNumber;

    private String pageSize;

    private String sortOrder;

    private String sortBy;

}
