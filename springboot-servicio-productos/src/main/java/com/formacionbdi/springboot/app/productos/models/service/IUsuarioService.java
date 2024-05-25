package com.formacionbdi.springboot.app.productos.models.service;



import com.formacionbdi.springboot.app.productos.models.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUsuarioService {

    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario createUsuario(Usuario usuario);

    public Usuario modifiedUsuario(Usuario usuario);

    public void deleteUsuario(Long id);

}
