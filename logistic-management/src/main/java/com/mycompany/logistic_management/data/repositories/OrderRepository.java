package com.mycompany.logistic_management.data.repositories;

import com.mycompany.logistic_management.data.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String> {
    Order findByorderId(String id);
}
