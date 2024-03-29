package com.asdfgmfc.productcommon;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfoOutput {
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus;
    private Integer categoryType;
}
