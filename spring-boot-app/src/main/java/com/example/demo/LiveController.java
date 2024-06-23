package com.example.simplehttpapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiveController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/live")
    public String live() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return "Well done";
        } catch (Exception e) {
            return "Maintenance";
        }
    }
    
}
