package com.extraaaz.api_gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/gateway")
public class GatewayController {

    private final RestTemplate restTemplate;

    @Autowired
    public GatewayController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Health Check Endpoint
    @GetMapping("/health")
    public String healthCheck() {
        return "API Gateway is running!";
    }

    // Example of forwarding a request to the PHP backend
    @GetMapping("/php-api/sample")
    public String forwardRequestToPhpBackend() {
        String phpBackendUrl = "http://your-php-backend-url/sample-endpoint";
        return restTemplate.getForObject(phpBackendUrl, String.class);
    }
}
