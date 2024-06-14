package com.example.jdbchomework;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {
    private Service service;

    @GetMapping("/products/fetch-product")
    public List<String> fetchProduct(@RequestParam (value = "name", required = false) String name) {
        return service.getProductName(name);
    }
}
