package com.quinoa.cafe.springboot.app.models.dao;

import com.quinoa.cafe.springboot.app.models.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDAO extends CrudRepository<Categoria, Long> {
}
