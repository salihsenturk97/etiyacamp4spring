package com.etiya.northwind.business.abstracts;

import com.etiya.northwind.business.responses.products.EmployeeListResponse;

import java.util.List;

public interface EmployeeService {
    List<EmployeeListResponse> getAll();
}
