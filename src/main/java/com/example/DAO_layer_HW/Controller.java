package com.example.DAO_layer_HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons/")
public class Controller {
    @Autowired
    private Repository repository;

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city){
        return repository.findByCityOfLiving(city);
    }
    @GetMapping("/by-name-surname")
    public Optional<Person> getPersonByNameAndSurname(@RequestParam("name") String name, @RequestParam("surname") String surname){
        return repository.findByNameAndSurname(name, surname);
    }

    @GetMapping("/by-age-less-than")
    public List<Person> getPersonsByAgeLessThanOrderByAgeAsc(@RequestParam("age") Integer age){
        return repository.findByAgeLessThanOrderByAgeAsc(age);
    }
}
