package com.etiya.northwind.business.concretes;

import com.etiya.northwind.business.abstracts.EmployeeService;
import com.etiya.northwind.business.responses.products.EmployeeListResponse;
import com.etiya.northwind.dataAccess.abstracts.EmployeeRepository;
import com.etiya.northwind.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeManager(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeListResponse> getAll() {
        List<Employee> results = this.employeeRepository.findAll();
        List<EmployeeListResponse> responses = new ArrayList<>();
        for (Employee employee : results) {
            EmployeeListResponse response = new EmployeeListResponse();
            response.setEmployeeId(employee.getEmployeeId());
            response.setFirstName(employee.getFirstName());
            response.setLastName(employee.getLastName());
            response.setTitle(employee.getTitle());
            responses.add(response);
        }
        return responses;
    }
}
