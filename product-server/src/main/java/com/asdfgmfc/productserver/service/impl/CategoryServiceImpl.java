package com.asdfgmfc.productserver.service.impl;

import com.asdfgmfc.productserver.dataobject.ProductCategory;
import com.asdfgmfc.productserver.repository.ProductCategoryRepository;
import com.asdfgmfc.productserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
