package com.ordering.app.service;

import com.ordering.app.entity.Order;
import com.ordering.app.exceptions.OrderNotFoundException;
import com.ordering.app.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    @Override
    public Order save(Order order) {
        return repository.save(order);
    }

    @Override
    public Order findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException(String.format("Couldn't find order with id=%d", id)));
    }

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }

}
