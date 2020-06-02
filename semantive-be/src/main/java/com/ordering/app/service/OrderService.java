package com.ordering.app.service;

import com.ordering.app.entity.Order;

import java.util.List;

public interface OrderService {

    Order save(Order order);

    Order findById(Long id);

    List<Order> findAll();

}
