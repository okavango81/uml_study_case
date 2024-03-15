package com.okavango.uml_study_case.repositories;

import com.okavango.uml_study_case.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
