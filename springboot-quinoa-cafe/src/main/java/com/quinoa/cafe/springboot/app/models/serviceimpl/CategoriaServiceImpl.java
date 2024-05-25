package com.quinoa.cafe.springboot.app.models.serviceimpl;

import com.quinoa.cafe.springboot.app.models.dao.CategoriaDAO;
import com.quinoa.cafe.springboot.app.models.entity.Categoria;
import com.quinoa.cafe.springboot.app.models.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private CategoriaDAO categoriaDAO;

    @Override
    public List<Categoria> findAll(){
        return (List<Categoria>) categoriaDAO.findAll();
    }
}

