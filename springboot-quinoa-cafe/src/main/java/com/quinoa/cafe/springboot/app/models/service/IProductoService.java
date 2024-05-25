package com.quinoa.cafe.springboot.app.models.service;

import com.quinoa.cafe.springboot.app.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findByIdCategoria(Long idCategoria);
}
