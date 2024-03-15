package com.okavango.uml_study_case.services;


import com.okavango.uml_study_case.entity.Product;
import com.okavango.uml_study_case.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional(readOnly = true)
    public ResponseEntity<List<Product>> all(){
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok(products);
    }

    @Transactional(readOnly = true)
    public ResponseEntity<Product> byId(Long id){
        Optional<Product> product = productRepository.findById(id);
        return ResponseEntity.ok(product.get());
    }
}
