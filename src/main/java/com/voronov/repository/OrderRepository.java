package com.voronov.repository;

import com.voronov.domain.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);

    void delete(Order order);

    List<Order> getAll();

    Order getById(Integer id);
}
