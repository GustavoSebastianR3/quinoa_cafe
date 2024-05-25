package com.formacionbdi.springboot.app.productos.models.dao;

import com.formacionbdi.springboot.app.productos.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario, Long> {
}
