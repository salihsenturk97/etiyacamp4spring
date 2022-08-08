package com.etiya.northwind.business.responses.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierListResponse {

    private int supplierId;

    private String companyName;

    private String contactName;

    private String contactTitle;
}
