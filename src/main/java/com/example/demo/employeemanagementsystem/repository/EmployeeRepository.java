package com.example.demo.employeemanagementsystem.repository;

import com.example.demo.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // JPA will handle the heavy lifting!
}