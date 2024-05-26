package com.quinoa.cafe.springboot.app.controller;

import com.quinoa.cafe.springboot.app.models.entity.Categoria;
import com.quinoa.cafe.springboot.app.models.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/listar")
    public List<Categoria> listar(){
        return categoriaService.findAll();
    }


}
