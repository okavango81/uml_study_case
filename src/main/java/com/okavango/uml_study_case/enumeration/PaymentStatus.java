package com.okavango.uml_study_case.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PaymentStatus {
    PENDING(1,"PENDING"),
    PAID_OFF(2,"PAID_OFF"),
    CANCELED(3,"CANCELED");

    private Integer code;
    private String description;

    public static PaymentStatus toStatus(Integer code){
        if (code.equals(null)){
            return null;
        }
    for (PaymentStatus status: PaymentStatus.values()) {
        if (code.equals(status.getCode())){
            return status;
            }
        }
        throw new IllegalArgumentException("Code invalid");
    }
}
