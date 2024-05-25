package com.formacionbdi.springboot.app.productos.models.service;

import com.formacionbdi.springboot.app.productos.models.entity.Categoria;

import java.util.List;

public interface ICategoriaService {

    public List<Categoria> findAll();


}
