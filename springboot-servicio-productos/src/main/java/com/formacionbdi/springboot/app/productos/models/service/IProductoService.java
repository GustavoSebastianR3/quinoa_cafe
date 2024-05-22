package com.formacionbdi.springboot.app.productos.models.service;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService
{
    public List<Producto> findAll();

    public Producto findById(Long id);

    public Producto createProducto(Producto producto);

    public Producto modifiedProducto(Producto producto);

    public void deleteProducto(Long id);
}
