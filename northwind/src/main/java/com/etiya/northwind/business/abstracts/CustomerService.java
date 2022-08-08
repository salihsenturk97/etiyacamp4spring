package com.etiya.northwind.business.abstracts;

import com.etiya.northwind.business.responses.products.CustomerListResponse;

import java.util.List;

public interface CustomerService {
    List<CustomerListResponse> getAll();
}
