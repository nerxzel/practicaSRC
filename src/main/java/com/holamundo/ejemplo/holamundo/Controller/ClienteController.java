package com.holamundo.ejemplo.holamundo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @GetMapping
    public String index(){
        return "Bienvenidos el listado de clientes";
    }

}
