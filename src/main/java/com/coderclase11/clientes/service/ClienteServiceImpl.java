package com.coderclase11.clientes.service;

import com.coderclase11.clientes.model.Cliente;
import com.coderclase11.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository repository;

    @Override
    public Cliente buscarPordni(long dni) {
        return repository.findById(dni).orElse(null);
    }


    @Override
    public List<Cliente> buscarTodosLosClientes() {
        return repository.findAll();
    }
}
