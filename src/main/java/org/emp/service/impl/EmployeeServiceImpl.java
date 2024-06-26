package org.emp.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.emp.dto.Employee;
import org.emp.entity.EmployeeEntity;
import org.emp.repository.EmployeeRepository;
import org.emp.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    final EmployeeRepository repository;
    @Override
    public void addEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new ObjectMapper().convertValue(employee, EmployeeEntity.class);
        repository.save(employeeEntity);
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<>();

        List<EmployeeEntity> employeeEntityList = repository.findAll();
        employeeEntityList.forEach(employeeEntity -> {
            Employee employee = new ObjectMapper().convertValue(employeeEntity, Employee.class);
            employeeList.add(employee);
        });
        return employeeList;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
    }
}
