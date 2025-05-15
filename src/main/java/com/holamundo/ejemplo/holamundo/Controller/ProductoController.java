package com.holamundo.ejemplo.holamundo.Controller;

import com.holamundo.ejemplo.holamundo.Model.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v2/productos")
public class ProductoController {


    private List<Producto> productos = new ArrayList<>();

    public ProductoController() {
    productos.add(new Producto(1, "Notebook", 1000000.0));
    productos.add(new Producto(2, "Celular", 500000.0));
    productos.add(new Producto(3, "Tablet", 750000.0));
}
    @GetMapping
    public String index(){
        return "Bievenidos al listado de productos";
    }

    @GetMapping("/buscar2/{Id}")
    public String buscarProductoId2(@PathVariable int Id) {
        for (int i = 0; i < productos.size(); i++){
            Producto producto = productos.get(i);
            if (producto.getId() == Id){
                return "Producto: " + producto.getNombre() + " tiene un precio de: $" + producto.getPrecio();

            } 
        }
        return "Producto no encontrado";
    }

    @GetMapping("/buscar/{Id}")
    public String buscarProductoId(@PathVariable int Id) {
        for(Producto producto : productos){
            if(producto.getId() == Id){
                return "Producto: " + producto.getNombre() + ", $" + producto.getPrecio();
            }
        }
        return "Producto no encontrado";
    }
    

}
