package com.holamundo.ejemplo.holamundo.Model;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    
    private int Id;
    private String nombre;
    private double precio;

}
