package com.okavango.uml_study_case.services;

import com.okavango.uml_study_case.entity.State;
import com.okavango.uml_study_case.repositories.StateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StateService {

    private final StateRepository stateRepository;

    @Transactional(readOnly = true)
    public ResponseEntity<List<State>> all(){
        List<State> states = stateRepository.findAll();
        return ResponseEntity.ok(states);
    }

    @Transactional(readOnly = true)
    public ResponseEntity<State> byId(Long id){
        Optional<State> state = stateRepository.findById(id);
        return ResponseEntity.ok(state.get());
    }
}
