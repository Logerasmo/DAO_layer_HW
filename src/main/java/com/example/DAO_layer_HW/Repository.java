package com.example.DAO_layer_HW;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

@org.springframework.stereotype.Repository

public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private NamedParameterJdbcTemplate template;


    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM Person p", Person.class).getResultList().stream().filter(p -> p.getСityOfLiving().equals(city)).toList();
    }
}
