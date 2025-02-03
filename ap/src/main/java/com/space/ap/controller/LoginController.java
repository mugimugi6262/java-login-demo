package com.space.ap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {
    @GetMapping("/log")
    public ResponseEntity<String> logMessage() {
        System.out.println("Hello!");
        return ResponseEntity.ok("Message logged successfully");
    }
}
