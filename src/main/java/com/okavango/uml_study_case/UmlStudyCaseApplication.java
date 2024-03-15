package com.okavango.uml_study_case;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;

@SpringBootApplication
public class UmlStudyCaseApplication {

    public static void main(String[] args) {

        SpringApplication.run(UmlStudyCaseApplication.class, args);

        // teste para confirmacao de configuracao para local e formatacao de moeda
        BigDecimal value = new BigDecimal("15890.90");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String country = "brasil";
        System.out.println();
        System.out.println("************VALIDAÇÃO DE CONFIGUAÇÃO*****************");
        System.out.printf("Hora oficial %s: %s%n" ,country, LocalDateTime.now());
        System.out.printf("Exemplo de valor monetário %s: %s%n",country ,numberFormat.format(value));
        System.out.println("*****************************************************");
        System.out.println();
    }

}
