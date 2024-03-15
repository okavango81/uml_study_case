package com.okavango.uml_study_case.services;

import com.okavango.uml_study_case.entity.City;
import com.okavango.uml_study_case.repositories.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    @Transactional(readOnly = true)
    public ResponseEntity<List<City>> all(){
        List<City> cities = cityRepository.findAll();
        return ResponseEntity.ok(cities);
    }

    @Transactional(readOnly = true)
    public ResponseEntity<City> byId(Long id){
        Optional<City> city = cityRepository.findById(id);
        return ResponseEntity.ok(city.get());
    }
}
