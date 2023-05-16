package com.demo.Spring.boot.service;

import com.demo.Spring.boot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee( Employee employee)
    {
        employeeRepository.saveEmployee(employee);
    }

}
