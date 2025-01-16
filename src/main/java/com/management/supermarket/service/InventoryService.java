package com.management.supermarket.service;

import com.management.supermarket.model.Inventory;

public interface InventoryService {
    Inventory getInventoryByProductId(Long productId);
    void updateStockQuantity(Long productId, int quantity);
    void increaseStock(Long productId, int quantity);
    void decreaseStock(Long productId, int quantity);
}
