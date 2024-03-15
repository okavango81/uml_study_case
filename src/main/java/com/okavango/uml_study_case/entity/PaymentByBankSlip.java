package com.okavango.uml_study_case.entity;
import com.okavango.uml_study_case.enumeration.PaymentStatus;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PaymentByBankSlip extends Payment{
    private LocalDateTime Payday;
    private LocalDateTime DueDate;

    public PaymentByBankSlip(Long id, PaymentStatus status, Order order, LocalDateTime payday, LocalDateTime dueDate) {
        super(id, status, order);
        Payday = payday;
        DueDate = dueDate;
    }
}
