package com.example.login.Service.impl;


import com.example.login.Dto.EmployeeDTO;
import com.example.login.Entity.Employee;
import com.example.login.Repo.EmployeeRepo;
import com.example.login.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeIMPL implements EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO)
    {

        Employee employee = new Employee(
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getAddress(),
                employeeDTO.getMobile()
        );
        employeeRepo.save(employee);
        return employee;
    }
}
