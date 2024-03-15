package com.example.login.Service;

import com.example.login.Dto.EmployeeDTO;
import com.example.login.Entity.Employee;


public interface EmployeeService {
    Employee addEmployee(EmployeeDTO employeeDTO);
}
