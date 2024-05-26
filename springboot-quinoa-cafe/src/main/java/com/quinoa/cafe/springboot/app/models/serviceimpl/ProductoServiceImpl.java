package com.quinoa.cafe.springboot.app.models.serviceimpl;

import com.quinoa.cafe.springboot.app.models.dao.ProductoDAO;
import com.quinoa.cafe.springboot.app.models.entity.Producto;
import com.quinoa.cafe.springboot.app.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoDAO producto1DAO;

    @Override
    public List<Producto> findByIdCategoria(Long idCategoria) {
        return (List<Producto>) producto1DAO.findByIdCategoria(idCategoria);
    }
}
