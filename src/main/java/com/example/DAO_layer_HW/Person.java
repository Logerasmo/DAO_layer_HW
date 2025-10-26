package com.example.DAO_layer_HW;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private String city_of_living;

    public Person(long id, String name, String surname, int age, String phone_number, String city_of_living) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone_number = phone_number;
        this.city_of_living = city_of_living;
    }

    public Person(){}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getCity_of_living() {
        return city_of_living;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setCity_of_living(String city_of_living) {
        this.city_of_living = city_of_living;
    }
}
