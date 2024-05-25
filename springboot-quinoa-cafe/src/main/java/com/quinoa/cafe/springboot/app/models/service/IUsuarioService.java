package com.quinoa.cafe.springboot.app.models.service;

import com.quinoa.cafe.springboot.app.models.entity.Usuario;

import java.util.List;


public interface IUsuarioService {

    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario createUsuario(Usuario usuario);

    public Usuario modifiedUsuario(Usuario usuario);

    public void deleteUsuario(Long id);

}
