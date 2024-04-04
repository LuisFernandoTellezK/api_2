package com.evidencia.api_2.Service;

import com.evidencia.api_2.Entity.Product;
import com.evidencia.api_2.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
}