package com.SecurityApp.Models;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
   // @NotEmpty(message = "Enter username")
    @Column(name = "role")
    private String role;
    @Column(name = "username")
    private String username;
    //@NotEmpty(message = "Enter username")
    @Column(name = "year_of_birth")
    private int yearOfBirth;
   // @NotEmpty(message = "Enter username")
    @Column(name="password")
    private String password;

    public Person() {
    }

    public Person(String username, int yearOfBirth, String role) {
        this.username = username;
        this.yearOfBirth = yearOfBirth;
        this.role=role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
