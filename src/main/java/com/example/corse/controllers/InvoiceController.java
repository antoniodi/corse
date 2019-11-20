package com.example.corse.controllers;

import com.example.corse.models.domain.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private Invoice anInvoice;

    @GetMapping("/see")
    public ModelAndView index(ModelAndView aMV) {
        aMV.addObject("title","Invoice");
        aMV.addObject("anInvoice", anInvoice);
        aMV.setViewName("invoice/see");
        return aMV;
    }

}
