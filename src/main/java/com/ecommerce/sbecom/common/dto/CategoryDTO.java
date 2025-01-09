package com.ecommerce.sbecom.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    @Schema(description = "Unique identifier for the category", example = "1")
    private Long id;

    @Schema(description = "Name of the category", example = "Electronics")
    private String categoryName;

}
