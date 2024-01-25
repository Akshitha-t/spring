package com.example.spring_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_jpa.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
