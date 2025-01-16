package com.management.supermarket.service;

import com.management.supermarket.model.Customer;

public interface CustomerService {
    Customer createCustomer(String name, String email, String address);
    Customer getCustomerById(Long id);
}