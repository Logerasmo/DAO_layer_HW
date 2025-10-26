package com.example.DAO_layer_HW;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons/by-city")
public class Controller {
    private final Repository repository = new Repository();

    @GetMapping
    public List<Person> getProductName(@RequestParam("city") String city){
        return repository.getPersonsByCity(city);
    }
}
