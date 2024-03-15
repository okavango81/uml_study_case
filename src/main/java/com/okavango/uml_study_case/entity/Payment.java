package com.okavango.uml_study_case.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.okavango.uml_study_case.enumeration.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Integer status;

    @OneToOne
    @JoinColumn(name = "order_id")
    @MapsId
    @JsonBackReference
    private Order orderClient;

    public Payment(Long id, PaymentStatus status, Order orderClient) {
        this.id = id;
        this.status = status.getCode();
        this.orderClient = orderClient;
    }

    public PaymentStatus getStatus() {
        return PaymentStatus.toStatus(status);
    }

    public void setStatus(PaymentStatus status) {
        this.status = status.getCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
