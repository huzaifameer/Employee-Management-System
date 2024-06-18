package org.emp.service.impl;

import org.emp.dto.Employee;
import org.emp.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList = new ArrayList<>();
    @Override
    public void addEmplyee(Employee employee) {

    }

    @Override
    public List<Employee> getAll() {
        return null;
    }
}
