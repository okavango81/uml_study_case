package com.okavango.uml_study_case.services;


import com.okavango.uml_study_case.entity.Order;
import com.okavango.uml_study_case.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    @Transactional(readOnly = true)
    public ResponseEntity<Order> byId(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return ResponseEntity.ok(order.get());
    }

    @Transactional(readOnly = true)
    public ResponseEntity<List<Order>> all(){
        List<Order> orders = orderRepository.findAll();
        return ResponseEntity.ok(orders);
    }

}
