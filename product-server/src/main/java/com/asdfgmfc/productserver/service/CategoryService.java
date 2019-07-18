package com.asdfgmfc.productserver.service;

import com.asdfgmfc.productserver.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
