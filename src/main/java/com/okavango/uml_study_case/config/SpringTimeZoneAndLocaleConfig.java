package com.okavango.uml_study_case.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;
import java.util.TimeZone;

@Configuration
public class SpringTimeZoneAndLocaleConfig {

    @PostConstruct
    public void timeZoneConfig() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        //TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
    }

    @PostConstruct
    public void localeConfig() {
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        //Locale.setDefault(Locale.forLanguageTag("ja-JP"));
    }
}
