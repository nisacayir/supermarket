package com.management.supermarket.service;

import com.management.supermarket.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer createCustomer(String name, String email, String address) {
        // Implement logic to create a customer
        return new Customer();
    }

    @Override
    public Customer getCustomerById(Long id) {
        // Implement logic to get a customer by ID
        return new Customer();
    }
}