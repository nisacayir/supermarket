package com.management.supermarket.service;

import com.management.supermarket.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "category-product-microservice", url = "http://localhost:8081") // Mikroservis adı ve URL'i
public interface ProductFeignClient {

    @GetMapping("/api/products") // Tüm ürünleri getir
    List<Product> getAllProducts();

    @PostMapping("/api/products") // Yeni ürün ekle
    Product addProduct(@RequestBody Product product);
}