package com.formacionbdi.springboot.app.productos.controllers;



import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.entity.Usuario;
import com.formacionbdi.springboot.app.productos.models.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @GetMapping("/listar")
    public List<Usuario> list(){ return usuarioService.findAll(); }

    @GetMapping("/ver/{id}")
    public Usuario detalle(@PathVariable Long id) {return usuarioService.findById(id);}

    @PostMapping("/crear")
    public Usuario crear(@RequestBody Usuario usuario)
    {
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/modificar")
    public Usuario modificar(@RequestBody Usuario usuario) {return usuarioService.modifiedUsuario(usuario);}

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {usuarioService.deleteUsuario(id);}



}
