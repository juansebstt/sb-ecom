package com.ecommerce.sbecom.controller;

import com.ecommerce.sbecom.common.constant.ApiPathConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ApiPathConstant.V1_ROUTE + ApiPathConstant.ADMIN_ROUTE + ApiPathConstant.CATEGORY_ROUTE)
public interface CategoryApi {

    @GetMapping()


}
