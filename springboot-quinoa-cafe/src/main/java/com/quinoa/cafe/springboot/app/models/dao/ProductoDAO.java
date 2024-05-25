package com.quinoa.cafe.springboot.app.models.dao;

import com.quinoa.cafe.springboot.app.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoDAO extends CrudRepository<Producto, Long> {
    List<Producto> findByIdCategoria(Long idCategoria);
}
