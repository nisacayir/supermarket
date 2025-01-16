package com.management.supermarket.service;

import com.management.supermarket.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableFeignClients
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductFeignClient productFeignClient;

    @Override
    public List<Product> getAllProducts() {
        return productFeignClient.getAllProducts();
    }

    @Override
    public Product addProduct(Product product) {
        return productFeignClient.addProduct(product);
    }
}