package com.etiya.northwind.business.responses.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductListResponse {

    private int product_Id;
    private String productName;
    private double unitPrice;
    private int unitsInStock;
    private String categoryId;
    private String categoryName;
}
