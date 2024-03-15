package com.okavango.uml_study_case.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ClientType {
    PHYSICAL_PERSON(1,"PHYSICAL PERSON"),
    LEGAL_PERSON(2, "LEGAL_PERSON");

    private Integer code;
    private String description;

    public static ClientType toEnum(Integer code){
        if (code.equals(null)){
            return null;
        }
        for (ClientType type: ClientType.values()) {
            if (code.equals(type.getCode())){
                return type;
            }
        }
        throw new IllegalArgumentException("Code invalid");
    }
}
