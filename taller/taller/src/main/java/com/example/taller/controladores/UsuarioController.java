package com.example.taller.controladores;

// UsuarioController.java
@Controller
public class UsuarioController {

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    @GetMapping("/registro")
    public String mostrarRegistro() {
        return "registro";
    }
}
