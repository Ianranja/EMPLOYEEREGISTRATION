package com.example.login.EmployeeController;

import com.example.login.Dto.EmployeeDTO;
import com.example.login.Entity.Employee;
import com.example.login.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/save")
    public Employee saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        Employee id = employeeService.addEmployee(employeeDTO);
        return id;
    }
}
