package com.example.corse.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Invoice {

    @Value("${anInvoice.description}")
    private String description;

    @Autowired
    private Client client;

    @Autowired
    private List<InvoiceItem> items;

    public String getDescription() {
        return description;
    }

    public Client getClient() {
        return client;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }
}
