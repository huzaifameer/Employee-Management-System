package org.emp.controller;

import org.emp.dto.Employee;
import org.emp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/emp-controller")
public class EmployeeController {
    final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmplyee(employee);
    }
    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
}
