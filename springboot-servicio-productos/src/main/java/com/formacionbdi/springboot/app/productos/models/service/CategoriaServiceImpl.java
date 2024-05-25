package com.formacionbdi.springboot.app.productos.models.service;

import com.formacionbdi.springboot.app.productos.models.dao.CategoriaDAO;
import com.formacionbdi.springboot.app.productos.models.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private CategoriaDAO categoriaDAO;

    @Override
    public List<Categoria> findAll(){
        return (List<Categoria>) categoriaDAO.findAll();
    }
}

