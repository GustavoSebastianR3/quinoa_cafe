package com.formacionbdi.springboot.app.productos.models.service;

import com.formacionbdi.springboot.app.productos.models.entity.Producto1;

import java.util.List;

public interface IProducto1Service {
    public List<Producto1> findByIdCategoria(Long idCategoria);
}
