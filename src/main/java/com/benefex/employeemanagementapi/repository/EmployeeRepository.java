package com.benefex.employeemanagementapi.repository;

import com.benefex.employeemanagementapi.model.Employee; // Correct import

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom query methods can be added here
}

