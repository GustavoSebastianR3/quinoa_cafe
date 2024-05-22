package com.formacionbdi.springboot.app.productos.models.service;

import com.formacionbdi.springboot.app.productos.models.dao.ProductoDao;
import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll()
    {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public Producto findById(Long id)
    {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    public Producto createProducto(Producto producto)
    {
        return productoDao.save(producto);
    }

    @Override
    public Producto modifiedProducto(Producto producto)
    {
        Producto productoExistente = productoDao.findById(producto.getId()).orElse(null);

        productoExistente.setNombre(producto.getNombre());
        productoExistente.setPrecio(producto.getPrecio());
        productoExistente.setCreateAt(producto.getCreateAt());

        return productoDao.save(productoExistente);

    }

    @Override
    public void deleteProducto(Long id)
    {
        productoDao.deleteById(id);
    }
}
