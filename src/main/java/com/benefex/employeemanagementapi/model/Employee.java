package com.benefex.employeemanagementapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String employeeNo;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String surname;

    private String dob;
    private String gender;
    private String email;
    private String address;

    // getters and setters

    // constructor, etc.
}
