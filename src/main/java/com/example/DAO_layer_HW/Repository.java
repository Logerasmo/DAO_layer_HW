package com.example.DAO_layer_HW;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, Long> {
    List<Person> findByCityOfLiving(String cityOfLiving);
    List<Person> findByAgeLessThanOrderByAgeAsc(Integer age);
    Optional<Person> findByNameAndSurname(String name, String surname);
}
