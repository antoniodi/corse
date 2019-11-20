package com.example.corse.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CustomService")
//@Primary permite seleccionar el bind principal
public class CustomService implements IService {

    public String operacion() {
        return "Custom Service mi amor";
    }
}
