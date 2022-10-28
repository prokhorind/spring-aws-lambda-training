package com.ua.spring.aws;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @PostMapping("/ping")
    public String healthCheck() {
        return "pong";
    }

}
