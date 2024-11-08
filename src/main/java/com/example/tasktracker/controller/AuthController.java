package com.example.tasktracker.controller;


import com.example.tasktracker.model.User;
import com.example.tasktracker.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }
    @PostMapping("/register2")
    public ResponseEntity<String> register(@RequestBody User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userService.registerUser(user);
//        return ResponseEntity.ok("User registered successfully");
        return ResponseEntity.ok("User logged in successfully");
    }
    @GetMapping("/register")
    public ResponseEntity<String> register2(@RequestBody User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userService.registerUser(user);
//        return ResponseEntity.ok("User registered successfully");
        return ResponseEntity.ok("User logged in successfully2");
    }
    @GetMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok("User logged in successfully");
    }
}

