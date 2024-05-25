package com.formacionbdi.springboot.app.productos.controllers;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar()
    {
        return productoService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id)
    {
        return productoService.findById(id);
    }

    @PostMapping("/crear")
    public Producto crear(@RequestBody Producto producto)
    {
        return productoService.createProducto(producto);
    }

    @PutMapping("/modificar")
    public Producto modificar(@RequestBody Producto producto)
    {
        return productoService.modifiedProducto(producto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id)
    {
        productoService.deleteProducto(id);
    }
}
