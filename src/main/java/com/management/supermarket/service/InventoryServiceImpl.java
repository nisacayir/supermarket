package com.management.supermarket.service;

import com.management.supermarket.model.Inventory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InventoryServiceImpl implements InventoryService {
    private Map<Long, Inventory> inventoryMap = new HashMap<>();

    @Override
    public Inventory getInventoryByProductId(Long productId) {
        return inventoryMap.getOrDefault(productId, new Inventory());
    }

    @Override
    public void updateStockQuantity(Long productId, int quantity) {
        Inventory inventory = inventoryMap.get(productId);
        if (inventory != null) {
            inventory.setStockQuantity(quantity);
        }
    }

    @Override
    public void increaseStock(Long productId, int quantity) {
        Inventory inventory = inventoryMap.get(productId);
        if (inventory != null) {
            inventory.setStockQuantity(inventory.getStockQuantity() + quantity);
        }
    }

    @Override
    public void decreaseStock(Long productId, int quantity) {
        Inventory inventory = inventoryMap.get(productId);
        if (inventory != null) {
            inventory.setStockQuantity(inventory.getStockQuantity() - quantity);
        }
    }
}
