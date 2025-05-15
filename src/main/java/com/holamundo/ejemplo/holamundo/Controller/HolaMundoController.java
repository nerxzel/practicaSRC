package com.holamundo.ejemplo.holamundo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/HolaMundo")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "HOLA MUNDO";
    }

    @GetMapping("/hola2")
    public String saludo() {
        return "Hola a todos, mi nombre es Pedro";
    }

    @GetMapping("hola/{nombre}")
    public String saludoConNombre(@PathVariable String nombre){
        return "Hola, mi nombre es " + nombre;
    }

    @GetMapping("/hello")
    public String saludoConParam(@RequestParam String nombre) {
        return "Hola, soy " + nombre;
    }

    @GetMapping("/suma/{numero1}/{numero2}")
    public String sumaParam(@PathVariable int numero1, @PathVariable int numero2){
        int resultado = numero1 + numero2;
        return "El resultado de la suma es: " + resultado;
    }

    @GetMapping("/resta/{numero1}/{numero2}")
    public String restaParam(@PathVariable int numero1, @PathVariable int numero2){
        int resultado = numero1 - numero2;
        return "El resultado de la resta es: " + resultado;
    }

    @GetMapping("/division/{numero1}/{numero2}")
    public String divisionParam(@PathVariable double numero1, @PathVariable double numero2){
        double resultado = numero1 / numero2;
        return "El resultado de la división es: " + resultado;
    }

    @GetMapping("/multiplicacion/{numero1}/{numero2}")
    public String multiplicacionParam(@PathVariable int numero1, @PathVariable int numero2){
        int resultado = numero1 * numero2;
        return "El resultado de la multiplicación es: " + resultado;
    }
    
}
