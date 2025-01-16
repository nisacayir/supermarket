package com.management.supermarket.controller;

import com.management.supermarket.model.Order;
import com.management.supermarket.model.Product;
import com.management.supermarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        // Product nesnelerinden ID'leri çıkarıyoruz
        List<Long> productIds = order.getProductList()
                .stream()
                .map(Product::getId)
                .collect(Collectors.toList());

        return orderService.createOrder(order.getCustomerId(), productIds);
    }

    // Diğer metodlar aynı kalacak...
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PutMapping("/{id}")
    public void updateOrderStatus(@PathVariable Long id, @RequestBody String status) {
        orderService.updateOrderStatus(id, status);
    }
}