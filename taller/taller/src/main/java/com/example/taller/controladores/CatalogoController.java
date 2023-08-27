package com.example.taller.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CatalogoController {

    @Autowired
    private CatalogoService catalogoService;

    @GetMapping
    public String mostrarCatalogo(Model model) {
        List<Pelicula> peliculas = catalogoService.obtenerPeliculas();
        model.addAttribute("peliculas", peliculas);
        return "catalogo";
    }
}
