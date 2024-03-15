package com.okavango.uml_study_case.controller;

import com.okavango.uml_study_case.entity.Client;
import com.okavango.uml_study_case.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> all(){
        return clientService.all();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findBy(@PathVariable  Long id){
        return  clientService.byId(id);
    }
}
