package com.ordering.app.controller;

import com.ordering.app.entity.Order;
import com.ordering.app.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PutMapping
    public ResponseEntity<Order> save(@RequestBody Order order) {
        return ResponseEntity.ok(service.save(order));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}
