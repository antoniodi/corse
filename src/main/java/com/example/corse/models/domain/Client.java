package com.example.corse.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {
    @Value("${aClient.name}")
    private String name;

    @Value("${aClient.lastName}")
    private String lastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
