package com.okavango.uml_study_case.controller;


import com.okavango.uml_study_case.entity.Order;
import com.okavango.uml_study_case.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> all(){
        return orderService.all();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findBy(@PathVariable Long id){
        return orderService.byId(id);
    }


}
