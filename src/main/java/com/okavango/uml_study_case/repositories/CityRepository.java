package com.okavango.uml_study_case.repositories;

import com.okavango.uml_study_case.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}