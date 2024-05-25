package com.formacionbdi.springboot.app.productos.controllers;
import com.formacionbdi.springboot.app.productos.models.entity.Producto1;
import com.formacionbdi.springboot.app.productos.models.service.IProducto1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto1")
public class Producto1Controller {

    @Autowired
    private IProducto1Service producto1Service;

    @GetMapping("/listar/{idCategoria}")
    public List<Producto1> listar(@PathVariable Long idCategoria){
        return producto1Service.findByIdCategoria(idCategoria);


    }

}
