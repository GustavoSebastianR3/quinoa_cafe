package com.formacionbdi.springboot.app.productos.models.service;

import com.formacionbdi.springboot.app.productos.models.dao.Producto1DAO;
import com.formacionbdi.springboot.app.productos.models.entity.Producto1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Producto1ServiceImpl implements IProducto1Service {

    @Autowired
    private Producto1DAO producto1DAO;

    @Override
    public List<Producto1> findByIdCategoria(Long idCategoria) {
        return (List<Producto1>) producto1DAO.findByIdCategoria(idCategoria);
    }
}
