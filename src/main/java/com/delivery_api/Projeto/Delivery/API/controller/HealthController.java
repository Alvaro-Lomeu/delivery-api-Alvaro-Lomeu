package com.delivery_api.Projeto.Delivery.API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController // Spring, essa classe vai lidar com requisições HTTP
public class HealthController {

    @GetMapping("/health") // Spring, quando alguém acessar /health com GET, chame esse metodo
    public Map<String, String> health(){
        return Map.of(
            "status", "jvgvgyvgvgyvyvyg",
            "timestamp", LocalDateTime.now().toString(),
            "Service", "Delivery API"
        );
    }
}
