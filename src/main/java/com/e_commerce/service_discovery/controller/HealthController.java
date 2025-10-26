package com.e_commerce.service_discovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @Autowired
    private Environment environment;

    @GetMapping
    public Map<String, Object> health() {
        Map<String, Object> status = new HashMap<>();
        status.put("status", "UP");
        status.put("service", environment.getProperty("spring.application.name"));
        status.put("port", environment.getProperty("server.port"));
        status.put("timestamp", java.time.Instant.now().toString());
        status.put("version", "1.0.0");
        return status;
    }
}