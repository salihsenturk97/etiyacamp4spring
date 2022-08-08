package com.etiya.northwind.business.responses.products;

import com.etiya.northwind.entities.concretes.Order;
import com.etiya.northwind.entities.concretes.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailListResponse {

    private int orderId;
    private int productId;
    private String productName;
    private int quantity;




}
