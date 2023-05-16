package com.demo.Spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository extends JpaRepository<Employee, Integer> {


    public List<Employee> saveEmployee(Employee employee);
}
