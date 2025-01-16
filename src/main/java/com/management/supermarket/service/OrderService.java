package com.management.supermarket.service;

import com.management.supermarket.model.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Long customerId, List<Long> productIds);
    Order getOrderById(Long orderId);
    List<Order> getAllOrders();
    void updateOrderStatus(Long orderId, String status);
}