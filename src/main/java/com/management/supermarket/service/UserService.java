package com.management.supermarket.service;


import com.management.supermarket.model.User;

public interface UserService {
    User saveUser(User user);
    boolean validateUser(String email, String password);
}
