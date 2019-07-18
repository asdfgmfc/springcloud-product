package com.asdfgmfc.productserver.service;

import com.asdfgmfc.productcommon.DecreaseStockInput;
import com.asdfgmfc.productcommon.ProductInfoOutput;
import com.asdfgmfc.productserver.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {
    List<ProductInfo> findUpAll();
    List<ProductInfoOutput> findList(List<String> productIdList);
    void decreaseStock(List<DecreaseStockInput> cartDTOList);
}
