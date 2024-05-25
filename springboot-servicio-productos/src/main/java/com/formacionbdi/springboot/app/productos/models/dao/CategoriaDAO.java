package com.formacionbdi.springboot.app.productos.models.dao;

import com.formacionbdi.springboot.app.productos.models.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDAO extends CrudRepository<Categoria, Long> {
}
