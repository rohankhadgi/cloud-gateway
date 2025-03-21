package com.thrumi.cloud_gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod() {
        return "User Service is not responding. Please try again later.";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod() {
        return "Department Service is not responding. Please try again later.";
    }
}
