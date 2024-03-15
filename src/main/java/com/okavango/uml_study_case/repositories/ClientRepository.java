package com.okavango.uml_study_case.repositories;

import com.okavango.uml_study_case.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
