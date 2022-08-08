package com.etiya.northwind.business.abstracts;

import com.etiya.northwind.business.responses.products.OrderListResponse;

import java.util.List;

public interface OrderService {
    List<OrderListResponse> getAll();
}
