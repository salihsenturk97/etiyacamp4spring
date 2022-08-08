package com.etiya.northwind.business.responses.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeListResponse {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String title;

}
