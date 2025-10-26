package com.example.DAO_layer_HW;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/fetch-product")
public class Controller {
    private final Repository repository = new Repository();

    @GetMapping
    public String getProductName(@RequestParam("name") String name){
        return repository.getProductName(name);
    }
}
