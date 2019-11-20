package com.example.corse;

import com.example.corse.models.domain.InvoiceItem;
import com.example.corse.models.domain.Product;
import com.example.corse.models.service.CustomService;
import com.example.corse.models.service.IService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("MyDefinedService")
    public IService registerService() {
        return new CustomService();
    }

    @Bean
    public List<InvoiceItem> ingresItems() {
        Product aCarrot = new Product("Carrot", 120.0);
        Product aBanana = new Product("Banana", 100.0);

        InvoiceItem aVegetableInvoice = new InvoiceItem(aCarrot, 5);
        InvoiceItem aFruitsInvoice = new InvoiceItem(aBanana, 5);
        return Arrays.asList(aVegetableInvoice, aFruitsInvoice);
    }
}
