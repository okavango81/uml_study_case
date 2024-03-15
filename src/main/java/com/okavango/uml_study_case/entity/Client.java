package com.okavango.uml_study_case.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.okavango.uml_study_case.enumeration.ClientType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private String email;
    private String document;
    private Integer clientType;

    @OneToMany(mappedBy = "client")
    @JsonManagedReference
    private List<Address> addresses;

    @ElementCollection
    @CollectionTable(name = "client_phones")
    private Set<String> phones = new HashSet<>();

    @OneToMany(mappedBy = "client")
    @JsonBackReference
    private List<Order> orders = new ArrayList<>();

    public Client(Long id, String name, String email, String document, ClientType clientType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.document = document;
        this.clientType = clientType.getCode();
    }

    // getter e setter para o enum ClientType
    public ClientType getClientType() {
        return ClientType.toEnum(clientType);
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType.getCode();
    }
    // getter e setter para o enum ClientType


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
