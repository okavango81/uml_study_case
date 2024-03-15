package com.okavango.uml_study_case.controller;


import com.okavango.uml_study_case.entity.State;
import com.okavango.uml_study_case.services.StateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/states")
@RequiredArgsConstructor
public class StateController {

    private final StateService stateService;

    @GetMapping
    public ResponseEntity<List<State>> all(){
        return stateService.all();
    }

    @GetMapping("/{id}")
    public ResponseEntity<State> findBy(@PathVariable  Long id){
        return  stateService.byId(id);
    }
}
