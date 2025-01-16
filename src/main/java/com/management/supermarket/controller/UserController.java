package com.management.supermarket.controller;

import com.management.supermarket.model.User;
import com.management.supermarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userService.saveUser(user);
        return "Kullanıcı başarıyla kaydedildi!";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password) {
        boolean valid = userService.validateUser(email, password);
        if (valid) {
            return "Giriş başarılı!";
        }
        return "Kullanıcı adı veya şifre hatalı!";
    }
}