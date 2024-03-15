package com.okavango.uml_study_case.repositories;

import com.okavango.uml_study_case.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}