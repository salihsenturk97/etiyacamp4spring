package com.etiya.northwind.business.concretes;

import com.etiya.northwind.business.abstracts.OrderService;
import com.etiya.northwind.business.responses.products.OrderListResponse;
import com.etiya.northwind.dataAccess.abstracts.OrderRepository;
import com.etiya.northwind.entities.concretes.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderManager implements OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderManager(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderListResponse> getAll() {
        List<Order> result = this.orderRepository.findAll();
        List<OrderListResponse> responses = new ArrayList<>();
        for (Order order : result) {
            OrderListResponse response = new OrderListResponse();
            response.setOrderId(order.getOrderId());
            response.setOrderDate(order.getOrderDate());
            response.setCustomerCompanyName(order.getCustomer().getCompanyName());
            response.setEmployeeFirstName(order.getEmployee().getFirstName());
            response.setEmployeeLastName(order.getEmployee().getLastName());
            response.setCustomerContactName(order.getCustomer().getContactName());
            responses.add(response);

        }
        return responses;
    }
}
