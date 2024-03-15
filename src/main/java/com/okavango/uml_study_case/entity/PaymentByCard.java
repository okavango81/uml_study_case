package com.okavango.uml_study_case.entity;
import com.okavango.uml_study_case.enumeration.PaymentStatus;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PaymentByCard extends Payment{
    private Integer numberOfInstallments;

    public PaymentByCard(Long id, PaymentStatus status, Order order, Integer numberOfInstallments) {
        super(id, status, order);
        this.numberOfInstallments = numberOfInstallments;
    }
}
