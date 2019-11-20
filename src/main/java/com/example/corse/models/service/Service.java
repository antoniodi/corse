package com.example.corse.models.service;

import org.springframework.stereotype.Component;

@Component("Service")
public class Service implements IService {

    public String operacion() {
        return "operación dame un besito";
    }
}
