package com.etiya.northwind.business.concretes;

import com.etiya.northwind.business.abstracts.OrderDetailService;
import com.etiya.northwind.business.responses.products.OrderDetailListResponse;
import com.etiya.northwind.dataAccess.abstracts.OrderDetailRepository;
import com.etiya.northwind.dataAccess.abstracts.OrderRepository;
import com.etiya.northwind.entities.concretes.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDetailManager implements OrderDetailService {

    private OrderDetailRepository orderDetailRepository;

    @Autowired
    public OrderDetailManager(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }

    @Override
    public List<OrderDetailListResponse> getAll() {
        List<OrderDetail> result = this.orderDetailRepository.findAll();
        List<OrderDetailListResponse> responses = new ArrayList<>();

        for (OrderDetail orderDetail : result) {
            OrderDetailListResponse response = new OrderDetailListResponse();
            response.setOrderId(orderDetail.getOrder().getOrderId());
            response.setQuantity(orderDetail.getQuantitiy());
            response.setProductName(orderDetail.getProduct().getProductName());
            response.setProductId(orderDetail.getProduct().getProduct_Id());

            responses.add(response);

        }
        return responses;
    }
}
