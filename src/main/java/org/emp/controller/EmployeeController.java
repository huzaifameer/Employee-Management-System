package org.emp.controller;

import lombok.RequiredArgsConstructor;
import org.emp.dto.Employee;
import org.emp.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {
    final EmployeeService employeeService;

    @PostMapping("/add-employee")
    @ResponseStatus(HttpStatus.CREATED)
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employee.getFirstName()+"Added Successfully..!";
    }

    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @DeleteMapping("/delete-emp/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
        return "Delete is Success.........!";
    }
}
