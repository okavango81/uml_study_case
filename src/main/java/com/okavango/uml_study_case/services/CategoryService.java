package com.okavango.uml_study_case.services;


import com.okavango.uml_study_case.entity.Category;
import com.okavango.uml_study_case.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public ResponseEntity<List<Category>> all(){
        List<Category> categories = categoryRepository.findAll();
        return ResponseEntity.ok(categories);
    }
    @Transactional(readOnly = true)
    public ResponseEntity<Category> byId(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return ResponseEntity.ok(category.get());
    }
}
