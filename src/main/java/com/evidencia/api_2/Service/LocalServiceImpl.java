package com.evidencia.api_2.Service;

import com.evidencia.api_2.Entity.Local;
import com.evidencia.api_2.Repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImpl implements LocalService {
    @Autowired
    LocalRepository repository;

    @Override
    public List<Local> findAll() {
        return repository.findAll();
    }
}