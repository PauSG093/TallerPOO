package com.itsqmet.Spring1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/catalogo") //http:localhost:8080/catalogo
    public String catalogo(){
        return "catalogo";
    }
}
