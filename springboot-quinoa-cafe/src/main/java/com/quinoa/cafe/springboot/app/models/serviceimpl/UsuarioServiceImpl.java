package com.quinoa.cafe.springboot.app.models.serviceimpl;

import com.quinoa.cafe.springboot.app.models.dao.UsuarioDAO;
import com.quinoa.cafe.springboot.app.models.entity.Usuario;
import com.quinoa.cafe.springboot.app.models.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {


    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDAO.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioDAO.findById(id).orElse(null);
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    @Override
    public Usuario modifiedUsuario(Usuario usuario) {

        Usuario usuarioModificado = usuarioDAO.findById(usuario.getId()).orElse(null);

        usuarioModificado.setUsername(usuario.getUsername());
        usuarioModificado.setPassword(usuario.getPassword());
        usuarioModificado.setName(usuario.getName());
        usuarioModificado.setLastName(usuario.getLastName());
        usuarioModificado.setEmail(usuario.getEmail());
        usuarioModificado.setCreateAt(usuario.getCreateAt());

        return usuarioDAO.save(usuarioModificado);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioDAO.deleteById(id);
    }
}
