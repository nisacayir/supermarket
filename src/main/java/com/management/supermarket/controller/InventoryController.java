package com.management.supermarket.controller;

import com.management.supermarket.model.Inventory;
import com.management.supermarket.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{productId}")
    public Inventory getInventory(@PathVariable Long productId) {
        return inventoryService.getInventoryByProductId(productId);
    }

    @PutMapping("/{productId}/increase")
    public void increaseStock(@PathVariable Long productId, @RequestParam int quantity) {
        inventoryService.increaseStock(productId, quantity);
    }

    @PutMapping("/{productId}/decrease")
    public void decreaseStock(@PathVariable Long productId, @RequestParam int quantity) {
        inventoryService.decreaseStock(productId, quantity);
    }

    @PutMapping("/{productId}/update")
    public void updateStockQuantity(@PathVariable Long productId, @RequestParam int quantity) {
        inventoryService.updateStockQuantity(productId, quantity);
    }
}