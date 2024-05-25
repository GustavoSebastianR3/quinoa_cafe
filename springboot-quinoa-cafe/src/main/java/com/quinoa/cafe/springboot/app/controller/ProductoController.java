package com.quinoa.cafe.springboot.app.controller;

import com.quinoa.cafe.springboot.app.models.entity.Producto;
import com.quinoa.cafe.springboot.app.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService producto1Service;

    @GetMapping("/listar/{idCategoria}")
    public List<Producto> listar(@PathVariable Long idCategoria){
        return producto1Service.findByIdCategoria(idCategoria);
    }

}
