package com.etiya.northwind.business.concretes;

import com.etiya.northwind.business.abstracts.CustomerService;
import com.etiya.northwind.business.responses.products.CustomerListResponse;
import com.etiya.northwind.dataAccess.abstracts.CustomerRepository;
import com.etiya.northwind.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerListResponse> getAll() {
        List<Customer> result = this.customerRepository.findAll();
        List<CustomerListResponse> responses = new ArrayList<>();
        for (Customer customer : result) {
            CustomerListResponse response = new CustomerListResponse();
            response.setCustomerId((customer.getCustomerId()));
            response.setCompanyName(customer.getCompanyName());
            response.setContactName(customer.getContactName());
            responses.add(response);

        }
        return responses;
    }
}
