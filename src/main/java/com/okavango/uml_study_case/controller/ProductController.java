package com.okavango.uml_study_case.controller;


import com.okavango.uml_study_case.entity.Product;
import com.okavango.uml_study_case.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> all(){
        return productService.all();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findBy(@PathVariable  Long id){
        return  productService.byId(id);
    }
}
