package com.quinoa.cafe.springboot.app.models.dao;

import com.quinoa.cafe.springboot.app.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario, Long> {
}
