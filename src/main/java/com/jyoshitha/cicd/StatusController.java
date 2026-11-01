
package com.jyoshitha.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatusController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
            "message", "Cloud CI/CD Pipeline Application is Running!",
            "status", "Success"
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "application", "Cloud CI/CD Pipeline",
            "status", "UP"
        );
    }
}
