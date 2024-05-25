package com.formacionbdi.springboot.app.productos.models.dao;

import com.formacionbdi.springboot.app.productos.models.entity.Producto1;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Producto1DAO extends CrudRepository<Producto1, Long> {
    List<Producto1> findByIdCategoria(Long idCategoria);
}
