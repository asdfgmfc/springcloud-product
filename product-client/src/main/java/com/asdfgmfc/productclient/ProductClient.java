package com.asdfgmfc.productclient;

import com.asdfgmfc.productcommon.DecreaseStockInput;
import com.asdfgmfc.productcommon.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

//@FeignClient(name = "product", fallback = ProductClient.ProductClientFallback.class)
@FeignClient(name = "product")
public interface ProductClient {
    @GetMapping("/msg")
    String productMsg();

    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> cartDTOList);

//    @Component
//    static class ProductClientFallback implements ProductClient {
//
//        @Override
//        public String productMsg() {
//            return null;
//        }
//
//        @Override
//        public List<ProductInfoOutput> listForOrder(List<String> productIdList) {
//            return null;
//        }
//
//        @Override
//        public void decreaseStock(List<DecreaseStockInput> cartDTOList) {
//
//        }
//    }
}
