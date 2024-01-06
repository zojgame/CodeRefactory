package com.rvafin.springjwt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenaiConfiguration {

    @Value("${openai.api.url}")
    private String url;
    @Value("${openai.api.key}")
    private String key;
    @Value("${openai.model}")
    private String model;

    public OpenaiConfiguration(){}

    public String getUrl() {
        return url;
    }

    public String getKey() {
        return key;
    }

    public String getModel() {
        return model;
    }
}
