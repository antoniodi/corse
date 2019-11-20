package com.example.corse.controllers;

import com.example.corse.models.User;
import com.example.corse.models.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// Se agrega la ruta de primer nivel ejemplo: localhost:8080/app/index
@RequestMapping("/app")
public class IndexController {

    @Autowired
    @Qualifier("MyDefinedService")
    private IService aService;

    @GetMapping({"/index", "/"})
    public ModelAndView index(ModelAndView aMV) {
        aMV.addObject("title","Hola Bebesita with MV");
        aMV.addObject("operacion", aService.operacion());
        aMV.setViewName("index");
        return aMV;
    }

    @GetMapping("/profile")
    public ModelAndView profile(ModelAndView aMV) {
        User anUser = new User();
        anUser.setName("Antonio");
        anUser.setLastName("Cortés");
        aMV.addObject("anUser",anUser);
        aMV.setViewName("profile");
        return aMV;
    }
}
