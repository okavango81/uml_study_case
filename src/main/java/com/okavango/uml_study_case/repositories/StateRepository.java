package com.okavango.uml_study_case.repositories;

import com.okavango.uml_study_case.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}