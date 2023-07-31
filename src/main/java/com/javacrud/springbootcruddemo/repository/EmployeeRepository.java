package com.javacrud.springbootcruddemo.repository;

import com.javacrud.springbootcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee  findByName(String name);
}
