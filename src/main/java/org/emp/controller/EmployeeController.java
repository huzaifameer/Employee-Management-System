package org.emp.controller;

import lombok.RequiredArgsConstructor;
import org.emp.dto.Employee;
import org.emp.entity.EmployeeEntity;
import org.emp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {
    final EmployeeService employeeService;

    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
    @GetMapping("/get-all")
    public List<EmployeeEntity> getAll(){
        return employeeService.getAll();
    }
}
