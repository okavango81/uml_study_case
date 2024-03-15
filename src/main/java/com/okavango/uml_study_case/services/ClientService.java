package com.okavango.uml_study_case.services;

import com.okavango.uml_study_case.entity.Client;
import com.okavango.uml_study_case.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ResponseEntity<List<Client>> all(){
        List<Client> clients = clientRepository.findAll();
        return ResponseEntity.ok(clients);
    }
    @Transactional(readOnly = true)
    public ResponseEntity<Client> byId(Long id){
        Optional<Client> client = clientRepository.findById(id);
        return ResponseEntity.ok(client.get());
    }
}
