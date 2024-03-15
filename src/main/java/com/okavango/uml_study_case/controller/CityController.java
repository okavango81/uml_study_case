package com.okavango.uml_study_case.controller;

import com.okavango.uml_study_case.entity.City;
import com.okavango.uml_study_case.services.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping
    public ResponseEntity<List<City>> all(){
        return cityService.all();
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> findBy(@PathVariable  Long id){
        return  cityService.byId(id);
    }
}
